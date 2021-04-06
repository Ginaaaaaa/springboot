<template>
  <div>
    <hr size="1" color="gray"> 
    <div class="footerWrapperContainer">
      <div class="footerWrapper">
        <span class="md-caption" style="margin-right:30px;">MyOnedayClass | 경기도 용인시 처인구 | 사업자등록번호 : 001-01-00000</span> 
        <md-button class="md-primary">고객지원</md-button>      
        <md-button class="md-primary">문의사항</md-button>              
      </div>
    </div>  
  </div>
</template>

<style>
hr {
  height:0; 
  border:0; 
  border-top:1px solid #e0dfdf; 
}
.footerWrapperContainer{
  display : flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  width: 1520px;
  height: 60px;
}
.footerWrapper{
  display : flex;
  flex-direction: row;
    justify-content: center;
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
      param : "param start"
    }
  },    
  methods:  {
      btnClick(){
    // 헤더를 보내줘서 cors 에러 방지하는 법
    //   this.$axios.get("http://localhost:8080/demoapi",{
    //     headers: {
    //       'Access-Control-Allow-Origin': '*',
    //       'Content-Type': 'application/json; charset = utf-8'
    //     }
    //   }).then((result) => {
    //       this.param = result.data.name;
    //     })
    //     .catch(e => {
    //       console.log('error:', e)
    //     })
    // },      
      this.$axios.get("http://localhost:8080/myoneday").then((result) => {
        console.log(result);
        this.param = result.data.userInfo[0].userNo;
        })
        .catch(e => {
          console.log('error:', e)
        })
    }
    }
  }
</script>

