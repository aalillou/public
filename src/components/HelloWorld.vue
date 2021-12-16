<template>
  <v-container fill-height fluid>
    <v-layout
      text-center
      row wrap align-center
    >
      <v-flex xs12 class="logo-container">
        <v-img
          :src="require('../assets/logo-blue.svg')"
          class="logo"
          contain
        ></v-img>
      </v-flex>

    </v-layout>
  </v-container>

</template>

<script>
  export default {
    data: () => ({})
  }
</script>

<style lang="scss">
  .logo-container {
    .logo {
      max-height: 300px;
    }
  }
  @media only screen and (min-width: 320px) and (max-width: 667px) and (orientation: portrait) {
    .logo-container {
      .logo {
        max-height: 150px;
      }
    }
  }
</style>
