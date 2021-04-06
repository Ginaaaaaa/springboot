<template>
  <div>
    <swiper class="swiper" :options="swiperOption">
      <swiper-slide style="background-color:purple;"></swiper-slide>
      <swiper-slide style="background-color:orange;"></swiper-slide>
      <swiper-slide style="background-color:green;"></swiper-slide>        
      <div class="swiper-pagination" slot="pagination"></div> 
    </swiper>
    <PopularClassSwipe></PopularClassSwipe>     
    <NewClassSwipe></NewClassSwipe>
    <LocalClassSwipe></LocalClassSwipe>          
  </div>
    
</template>


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
</style>



<script>
import { Swiper, SwiperSlide } from 'vue-awesome-swiper'
import 'swiper/css/swiper.css'
import PopularClassSwipe from '@/views/mainSwipe/PopularClassSwipe.vue'
import NewClassSwipe from '@/views/mainSwipe/NewClassSwipe.vue'
import LocalClassSwipe from '@/views/mainSwipe/LocalClassSwipe.vue'
export default {
  components: { 
    Swiper, 
    SwiperSlide,
    PopularClassSwipe,
    NewClassSwipe,
    LocalClassSwipe
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


