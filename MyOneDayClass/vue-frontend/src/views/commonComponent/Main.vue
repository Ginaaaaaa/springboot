<template>
  <swiper class="swiper" :options="swiperOption">
    <swiper-slide style="background-color:purple;"></swiper-slide>
    <swiper-slide><img src="https://amymhaddad.s3.amazonaws.com/morocco-blue.png"></swiper-slide>    
    <div class="swiper-pagination" slot="pagination"></div> 
  </swiper>
</template>

<style lang="scss" scoped>
.swiper { 
  height: 300px; 
  width: 100%;
  }
.swiper-slide { 
  display: flex; 
  justify-content: center; 
  align-items: center; 
  text-align: center; 
  font-weight: bold; 
  } 
:root {
  color: gray;
}
</style>

<script>
import { Swiper, SwiperSlide } from 'vue-awesome-swiper'
import 'swiper/css/swiper.css'

export default {
  components: { Swiper, SwiperSlide },
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


