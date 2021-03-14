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
import vue from 'vue'
import axios from 'axios';

vue.prototype.$axios = axios;

export default {
  name: 'Home',
  components: {
    HelloWorld
  },
  methods:  {
    btnClick(){
      alert("btnClicked!");

      this.$axios.get("http://localhost:8080/myoneday",{
        headers: {
          'Access-Control-Allow-Origin': '*',
          'Content-Type': 'application/json; charset = utf-8'
        }
      }).then((result) => {
          this.param = result.data.param;
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
