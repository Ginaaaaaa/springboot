<template>
<div>
  <div class="gnb">
    <div class="wrapper">
      <div style="font-weight: 600; font-size: x-large;">MyOnedayClass</div> 
      <div style="margin-left:800px;"><md-button class="md-primary">강사 로그인</md-button></div>
      <div><md-button class="md-raised md-primary">회원가입</md-button></div>
    </div>                               
  </div>
  <md-toolbar md-transparent>
    <md-button style="width:130px;">자수/손뜨개</md-button>
    <md-button style="width:130px;">요리/베이킹</md-button>
    <md-button>공예</md-button>
    <md-button>운동</md-button>
    <md-button style="width:130px;">캘리/드로잉</md-button>
    <md-button style="width:130px;">비누/캔들</md-button>                 
  </md-toolbar>
</div>    
</template>

<style>
.gnb{
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
</style>

<style lang="scss" scoped>
@import "~vue-material/dist/theme/engine"; // Import the theme engine
@include md-register-theme("default", (
  primary:  #b302cab0, // The primary color of your brand
  accent: #32e066  // The secondary color of your brand
));   // default css impor
@import "~vue-material/dist/theme/all";


.md-layout-item{
  width: 130px;
}
.md-toolbar{
  padding-left: 130px;
}
</style>
<script>
Vue.config.productionTip = false

import Vue from 'vue'
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'


Vue.use(VueMaterial)

export default {
  data: function(){
    return{
    }
  },    
  methods:  {
  btnClick(){
    alert('12');
  }
    }
  }
</script>

