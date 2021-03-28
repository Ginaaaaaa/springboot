<template>
  <div>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <strong><h5 class="md-title">MyOnedayClass</h5></strong>
     <md-toolbar>
      <div class="md-layout md-gutter">
        <div class="md-layout-item"><md-icon class="fa fa-user"></md-icon></div>
        <div class="md-layout-item"><md-icon class="fa fa-search"></md-icon></div>
      </div>
    </md-toolbar>
          <!-- <div class="md-layout md-gutter">
        <div class="md-layout-item"><md-icon class="md-size-2x fa fa-home"></md-icon></div>
        <div class="md-layout-item"><md-icon class="md-size-2x fa fa-sign-in"></md-icon></div>
      </div> -->
      <md-button class="md-raised"> Default</md-button>
      <md-button class="md-raised md-accent">Accent</md-button>

       <div>
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

    <md-card md-with-hover>
      <md-ripple>
        <md-card-header>
          <div class="md-title">Card with hover effect</div>
          <div class="md-subhead">It also have a ripple</div>
        </md-card-header>

        <md-card-content>
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
        </md-card-content>

        <md-card-actions>
          <md-button>Action</md-button>
          <md-button>Action</md-button>
        </md-card-actions>
      </md-ripple>
    </md-card>
    {{param}}
    <button v-on:click="btnClick">Click Me!</button>
    </div>      
  </div>
</template>

<style lang="scss" scoped>
@import "~vue-material/dist/theme/engine"; // Import the theme engine
@include md-register-theme("default", (
  primary:  #09eca8, // The primary color of your brand
  accent: #32e066  // The secondary color of your brand
));   // default css impor
@import "~vue-material/dist/theme/all";
  .md-title{
    margin-right : 1200px;
    font-weight: bold;
  }
  .md-layout-item{
    width: 10px;
  }

  .md-card {
  width: 320px;
  margin: 4px;
  display: inline-block;
  vertical-align: top;
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

