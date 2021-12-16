<template>


  <v-app class="home">

    <v-main>
      <hello-world />
    </v-main>


  <v-footer
    height="auto"
    fixed app
  >
    <v-card
      flat
      tile
      color="primary"
      class="white--text text-center"
      style="width:100%;"
    >
      <v-card-text>
      <v-btn
      color="primary"
          class="mx-3 white--text"
          fab
          href="mailto:info@aalillou.be"
        >
          <v-icon size="24px">mdi-mail</v-icon>
        </v-btn>
      </v-card-text>

      <v-card-text class="text-center white--text pt-0 my-3" >
        <div class="white--text text-center">
          <div style="display: inline-block; max-width:450px;">
            We want to hear from you! Aalillou Studio is super friendly, responsive, and ready to answer your questions about custom web application development and interactive digital asset design to boost sales.
          </div>
        </div>
      </v-card-text>

      <v-divider></v-divider>

      <v-card-text class="white--text">
        &copy;2021 — <strong>Aalillou Studio</strong>
      </v-card-text>
    </v-card>
  </v-footer>
  </v-app>
</template>

<script>
  import HelloWorld from '@/components/HelloWorld'
  export default {
    name: 'Home',
    components: {
      HelloWorld,
    },
  }
</script>
<style lang="scss">
  .home {
    flex: 1 1 auto;
    display: flex;
    min-height: 100vh;
    max-width: 100%;
    position: relative;
    .v-footer {
      padding: 0;
    }
  }
</style>
