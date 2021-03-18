<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
        {{param}}
    <div><button v-on:click="btnClick">Click Me!</button></div>
  </div>
  
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    HelloWorld
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
},
  data: function(){
    return{
      param : "param start"
    }
  }
}
</script>
