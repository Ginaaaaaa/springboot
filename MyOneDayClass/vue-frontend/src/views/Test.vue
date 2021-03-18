<template>
  <div>
    {{param}}
    <div><button v-on:click="btnClick">Click Me!</button></div>
  </div>
</template>



<script>
// @ is an alias to /src
import Vue from 'vue'
import axios from 'axios'

Vue.prototype.$http = axios;

export default {
  components: {

  },
  created(){
    // 1. 브라우저에서 직접 요청
    this.corsRequest();
  },
  methods:  {
    btnClick(){
      alert("btnClicked!");
      //  axios
      // .get('http://localhost:8080/controller/')
      // .then(response => (console.log(response)));
    },
    corsRequest() {
      axios.get("http://localhost:8080/controller/")
      .then((res) => {
        console.log('corsRequest res', res)
      })
      .catch((error) => {
        console.log('corsRequest error', error)
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
