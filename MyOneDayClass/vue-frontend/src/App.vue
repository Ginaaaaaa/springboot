<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  components: {
    
  }
}
</script>

<style lang="scss">
/** app thema global setting */
@import "~vue-material/dist/theme/engine"; // Import the theme engine
@include md-register-theme("default", (
  primary:  #b302cab0, // The primary color of your brand
  accent: #32e066,  // The secondary color of your brand
));   // default css impor
@import "~vue-material/dist/theme/all";

</style>