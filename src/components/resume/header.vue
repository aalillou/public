<template>

  <v-container>

    <div class="d-flex mb-2">

      <div class="pa-3">
        <v-avatar color="grey darken-1" size="90">
          <img src="@/assets/mo2.jpg" alt="Mo">
        </v-avatar>
      </div>

      <div class="pa-4 align-self-center">
        <div class="head-name">Mo Aalillou</div>
        <div class="head-title">DevOps & Senior Fullstack developer</div>

        <div class="head-contact">
          <v-icon small class="mr-2">mdi-home</v-icon> <span>Antwerp, Belgium</span>
        </div>
        <div>
          <v-icon small class="mr-2">mdi-phone</v-icon> <span>+32 478 75 57 60</span>
        </div>
        <div>
          <v-icon small class="mr-2">mdi-email</v-icon> <span>mo@aalillou.be</span>
        </div>
      </div>

      <div class="pa-2 ml-auto align-self-center">
        <v-card-actions class="white justify-center">
          <v-btn
            v-for="(social, i) in socials"
            :key="i"
            :color="social.color"
            class="white--text"
            fab
            icon
            small
            :href="social.link"
            target="_blank"
          >
            <v-icon>{{ social.icon }}</v-icon>
          </v-btn>
        </v-card-actions>


      </div>
    </div>



  </v-container>
</template>
<script>

export default {
  data: () => ({
    socials: [
      {
        icon: 'mdi-linkedin',
        color: 'cyan darken-1',
        link: 'https://www.linkedin.com/in/aalillou'
      },
      {
        icon: 'mdi-facebook',
        color: 'indigo',
        link: 'https://www.facebook.com/aalillou'
      }
    ],
  }),
  methods: {},
  mounted () {}
}
</script>

<style lang="scss">
</style>
