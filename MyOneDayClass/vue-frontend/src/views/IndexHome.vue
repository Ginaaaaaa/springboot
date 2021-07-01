<template>
  <div>
      <header>
        <Header @openLoginPopup="showLoginPopup"></Header>
      </header>
      <body>
        <Main></Main>
        <loginPopup :propsParam="isShowLogin"
                    @closeLoginPopup="showLoginPopup"></loginPopup>
      </body>
      <footer>
        <Footer></Footer>
      </footer>
  </div>
</template>


<script>

Vue.config.productionTip = false

import Vue from 'vue'
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'
import Header from './commonComponent/Header.vue'
import Main from './commonComponent/Main.vue'
import Footer from './commonComponent/Footer.vue'
import loginPopup from './user/UserLoginPopup.vue'

(VueMaterial)

export default {
  components : {
    Header,
    Main,
    Footer,
    loginPopup
  },
  data: function(){
    return{
      param : "param start",
      isShowLogin: false
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
    },
    showLoginPopup: function(data){
      this.isShowLogin = data;
    }
  }
}
</script>

