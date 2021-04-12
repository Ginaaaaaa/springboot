<template>
    <div>
    <div class="wrapperContainer">
      <div class="wrapper" style="font-weight: 600; font-size: large;">지역별 클래스 모아보기 🚩</div>
    </div> 
    <div class="mainContainer">
      <div class="main">
        <swiper class="swiper" :options="swiperOption" style="height:350px;">
          <swiper-slide>
            <md-card>
              <md-card-header>
                <div class="md-title">Card without hover effect</div>
              </md-card-header>
              <md-card-content>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
              </md-card-content>
              <md-card-actions>
                <md-button>Action</md-button>
                <md-button>Action</md-button>
              </md-card-actions>
            </md-card>
            <md-card>
              <md-card-header>
                <div class="md-title">Card without hover effect</div>
              </md-card-header>
              <md-card-content>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
              </md-card-content>
              <md-card-actions>
                <md-button>Action</md-button>
                <md-button>Action</md-button>
              </md-card-actions>
            </md-card>
            <md-card>
              <md-card-header>
                <div class="md-title">Card without hover effect</div>
              </md-card-header>
              <md-card-content>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
              </md-card-content>
              <md-card-actions>
                <md-button>Action</md-button>
                <md-button>Action</md-button>
              </md-card-actions>
            </md-card>
            <md-card>
              <md-card-header>
                <div class="md-title">Card without hover effect</div>
              </md-card-header>
              <md-card-content>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
              </md-card-content>
              <md-card-actions>
                <md-button>Action</md-button>
                <md-button>Action</md-button>
              </md-card-actions>
            </md-card>                                    
          </swiper-slide>
          <swiper-slide>
            <md-card>
              <md-card-header>
                <div class="md-title">Card without hover effect</div>
              </md-card-header>
              <md-card-content>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
              </md-card-content>
              <md-card-actions>
                <md-button>Action</md-button>
                <md-button>Action</md-button>
              </md-card-actions>
            </md-card>
            <md-card>
              <md-card-header>
                <div class="md-title">Card without hover effect</div>
              </md-card-header>
              <md-card-content>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
              </md-card-content>
              <md-card-actions>
                <md-button>Action</md-button>
                <md-button>Action</md-button>
              </md-card-actions>
            </md-card>
            <md-card>
              <md-card-header>
                <div class="md-title">Card without hover effect</div>
              </md-card-header>
              <md-card-content>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
              </md-card-content>
              <md-card-actions>
                <md-button>Action</md-button>
                <md-button>Action</md-button>
              </md-card-actions>
            </md-card>
            <md-card>
              <md-card-header>
                <div class="md-title">Card without hover effect</div>
              </md-card-header>
              <md-card-content>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
              </md-card-content>
              <md-card-actions>
                <md-button>Action</md-button>
                <md-button>Action</md-button>
              </md-card-actions>
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
  text-align: center; 
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
  data() { return { 
    swiperOption: { 
      slidesPerView: 1, 
      spaceBetween: 30, 
      loop: true, 
      pagination: { 
        el: '.swiper-pagination', 
        clickable: true }, 
             } 
            } 
        }
}
</script>