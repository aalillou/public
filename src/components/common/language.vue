<template>
  <v-btn-toggle
    v-model="$i18n.locale"
    mandatory
    class="language mx-auto"
    @change="changeLanguage"
    color="primary"
  >
    <v-btn v-for="(lang, i) in langs" :key="`Lang${i}`" :value="lang" small>{{ lang }}</v-btn>

  </v-btn-toggle>
</template>
<script>
export default {
  data () {
    return {
      langs: ['nl', 'fr', 'en']
    }
  },
  watch: {},
  computed: {},
  methods: {
    changeLanguage(lang) {
      this.$moment.locale(lang)
      this.$i18n.locale = lang
      this.$vuetify.lang.current = lang
      window.localStorage.setItem('lang', lang);
    }
  },
  created () {}
}
</script>
<style lang="scss" scoped>
  .theme--light{
    .v-btn:not(.v-btn--active) {
      color: rgba(0,0,0,.6);
    }
    .v-btn:before {
      background-color: transparent;
      color: rgba(0,0,0,.5);
    }
  }
.theme--light.v-btn:not(.v-btn--flat):not(.v-btn--text):not(.v-btn--outlined) {
    background-color: transparent;
}
</style>>


