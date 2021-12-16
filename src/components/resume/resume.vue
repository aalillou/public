<template>
<v-main class="grey lighten-5">
  <v-container>
  <div class="resume">
    <div style="text-align: right">
      <m-language></m-language>
      <v-btn text color="grey" @click.native="print">
        print <v-icon>mdi-printer</v-icon>
      </v-btn>
    </div>
    <div id="toPrint">
      <v-card class="resume my-3 pa-4" >

        <resume-header/>

        <resume-body/>

        <resume-timeline/>

        <resume-languages/>

        <resume-educ/>

      </v-card>
    </div>
  </div>
  </v-container>
</v-main>
</template>
<script>
import ResumeHeader from './header.vue';
import ResumeBody from './body.vue';
import ResumeEduc from './education.vue';
import ResumeTimeline from './timeline.vue';
import ResumeLanguages from './languages'
import PrintMixin from '@/components/common/print'
import MLanguage from '@/components/common/language'

export default {
  mixins: [PrintMixin],
  components: {
    'resume-header': ResumeHeader,
    'resume-body': ResumeBody,
    'resume-educ': ResumeEduc,
    'resume-timeline': ResumeTimeline,
    'resume-languages': ResumeLanguages,
    'm-language': MLanguage
  },
  data: () => ({}),
  methods: {
    print () {
      //var date = moment(this.selectedItem.date).format('MM-YYYY')
      var filename = 'Resume-Aalillou';

      this.printMe(filename);
    },
  },
  mounted () {}
}
</script>
<style lang="scss">
@import './resume.scss';
</style>
