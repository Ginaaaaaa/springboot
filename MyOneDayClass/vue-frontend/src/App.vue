<template>
  <div>
    <header>
      <Header></Header>
    </header>
    <body>
      <Main></Main>
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
import Header from './views/commonComponent/Header.vue'
import Main from './views/commonComponent/Main.vue'
import Footer from './views/commonComponent/Footer.vue'

Vue.use(VueMaterial)

export default {
  components : {
    Header,
    Main,
    Footer
  },
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

