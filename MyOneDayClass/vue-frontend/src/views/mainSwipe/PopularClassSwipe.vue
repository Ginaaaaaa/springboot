<template>
    <div>
    <div class="wrapperContainer">
      <div class="wrapper" style="font-weight: 600; font-size: large;">최근 인기 많은 클래스 😍</div>
    </div>
    <div class="mainContainer">
      <div class="main">
        <swiper class="swiper" :options="swiperOption" style="height:350px;">
          <swiper-slide>
            <md-card v-for="(item,idx) in cardsList1" :key="idx">
              <md-card-media>
                <img src="@/assets/knitting.jpg">
              </md-card-media>
              <md-card-header>
                <div>❤ {{item.classLike}}</div>
                <div style="font-size: medium">{{item.className}}</div>
                <div class="md-subhead">{{item.categoryName}}</div>
              </md-card-header>
              <md-card-content>
                <div style="font-size: small">{{item.classDescribe}}</div>
              </md-card-content>
            </md-card>                           
          </swiper-slide>
          <swiper-slide>
            <md-card v-for="(item,idx) in cardsList2" :key="idx">
              <md-card-media>
                <img src="@/assets/knitting.jpg">
              </md-card-media>
              <md-card-header>
                <div>❤ {{item.classLike}}</div>
                <div style="font-size: medium">{{item.className}}</div>
                <div class="md-subhead">{{item.categoryName}}</div>
              </md-card-header>
              <md-card-content>
                <div style="font-size: small">{{item.classDescribe}}</div>
              </md-card-content>
            </md-card>                           
          </swiper-slide> 
          <swiper-slide>
            <md-card v-for="(item,idx) in cardsList3" :key="idx">
              <md-card-media>
                <img src="@/assets/knitting.jpg">
              </md-card-media>
              <md-card-header>
                <div>❤ {{item.classLike}}</div>
                <div style="font-size: medium">{{item.className}}</div>
                <div class="md-subhead">{{item.categoryName}}</div>
              </md-card-header>
              <md-card-content>
                <div style="font-size: small">{{item.classDescribe}}</div>
              </md-card-content>
            </md-card>                           
          </swiper-slide>                                      
        <div class="swiper-pagination" slot="pagination"></div> 
        </swiper>      
      </div>            
    </div>   
</div> 
</template>

<style>
.wrapperContainer{
  display : flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  width: 1520px;
  height: 60px;
}
.wrapper{
  display : flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  width: 1200px;
  height: 60px;
}
.mainContainer{
  display : flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  width: 1520px;
  height: 350px;
  margin-bottom: 20px;
}
.main{
  display : flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  width: 1200px;
  height: 350px;
}
:root {
  --swiper-theme-color: gray;
}
</style>
<style lang="scss" scoped>
.swiper { 
  height: 400px; 
  width: 100%;
  }
.swiper-slide { 
  display: flex; 
  justify-content: space-between; 
  align-items: center; 
  text-align: left; 
  font-weight: bold; 
  } 
  .md-card {
    width: 250px;
    height: 330px;
    margin: 4px;
    display: inline-block;
    vertical-align: top;
  }
</style>

<style lang="scss" scoped>
@import "~vue-material/dist/theme/engine"; // Import the theme engine
@include md-register-theme("default", (
  primary:  #b302cab0, // The primary color of your brand
  accent: #32e066  // The secondary color of your brand
));   // default css impor
@import "~vue-material/dist/theme/all";

</style>

<script>
import { Swiper, SwiperSlide } from 'vue-awesome-swiper'
import 'swiper/css/swiper.css'
export default {
    components: { 
        Swiper, 
        SwiperSlide
        },
    data() { 
          return { 
            swiperOption: { 
                slidesPerView: 1, 
                spaceBetween: 30, 
                loop: true, 
                pagination: { 
                    el: '.swiper-pagination', 
                    clickable: true }, 
                 }, 
            cardsList1: [],
            cardsList2: [], 
            cardsList3: [],                        
                } 
            },
    mounted(){
      this.$axios.get("http://localhost:8080/myoneday/main").then(({data}) => {
        let recentClassList = data.recentClassInfoList;

        this.cardsList1 = recentClassList.slice(0,4);
        this.cardsList2 = recentClassList.slice(4,8);
        this.cardsList3 = recentClassList.slice(8,12);                  

        })
        .catch(e => {
          console.log('error:', e)
        })
    },
    methods:{
      
        }
    }
</script>