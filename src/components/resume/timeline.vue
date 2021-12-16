<template>
  <div class="pa-4">

    <v-row class="pb-1">
      <v-col cols="3" class="resume-title">{{ $t("resume.experience.title") }}</v-col>
      <v-col cols="9" class="resume-text">{{ $t("resume.experience.current.text") }}</v-col>
    </v-row>



  <light-timeline :items='experiences'>
    <template slot='tag' slot-scope='{ item }'>
      <div class="resume-tag">
        <div class="place">{{item.place}}</div>
        <div class="date">{{item.date}}</div>
      </div>
    </template>

    <template slot='content' slot-scope='{ item }'>
      <div>
        <div class="resume-title">{{item.company}}</div>
        <div class="resume-subtitle">{{item.title}}</div>
        <div class="resume-text">{{item.content}}</div>
        <ul v-if="item.list">
          <li v-for="(list, i) in item.list" :key="i" class="resume-text">test 1</li>
        </ul>
      </div>
    </template>
  </light-timeline>


  </div>
</template>
<script>

export default {
  data: () => ({
    items: [
      {
        place: 'Brussels',
        date: 'March 2003 - June 2005',
        company: 'Nationale Loterij',
        title: 'DevOPs & Senior Game developer',
        content: 'Lorem ipsum dolor sit amet, no nam oblique veritus. Commune scaevola imperdiet nec ut, sed euismod convenire principes at. Est et nobis iisque percipit, an vim zril disputando voluptatibus, vix an salutandi sententiae.',
        class: 'far fa-star'
      },
      {
        place: 'Antwerp',
        date: 'March 2003 - June 2005',
        company: 'Nationale Loterij',
        title: 'DevOPs & Senior Game developer',
        content: 'Lorem ipsum dolor sit amet, no nam oblique veritus. Commune scaevola imperdiet nec ut, sed euismod convenire principes at. Est et nobis iisque percipit, an vim zril disputando voluptatibus, vix an salutandi sententiae.',
        list:['test 1', 'test 1', 'test 1', 'test 1'],
        class: 'fas fa-star'
      },
      {
        place: 'Antwerp',
        date: 'March 2003 - June 2005',
        company: 'Nationale Loterij',
        title: 'DevOPs & Senior Game developer',
        content: 'Lorem ipsum dolor sit amet, no nam oblique veritus. Commune scaevola imperdiet nec ut, sed euismod convenire principes at. Est et nobis iisque percipit, an vim zril disputando voluptatibus, vix an salutandi sententiae.',
        list:['test 1', 'test 1', 'test 1', 'test 1'],
        class: 'fas fa-star'
      },
      {
        place: 'Antwerp',
        date: 'March 2003 - June 2005',
        company: 'Nationale Loterij',
        title: 'DevOPs & Senior Game developer',
        content: 'Lorem ipsum dolor sit amet, no nam oblique veritus. Commune scaevola imperdiet nec ut, sed euismod convenire principes at. Est et nobis iisque percipit, an vim zril disputando voluptatibus, vix an salutandi sententiae.',
        list:['test 1', 'test 1', 'test 1', 'test 1'],
        class: 'fas fa-star'
      }
    ]
  }),
  methods: {},
  computed: {
    experiences  () {
      var temp = this.$t("resume.experience.items");
      console.log('experiences:', temp)
      return temp;
    },
  },
  mounted () {}
}
</script>
<style lang="scss">
</style>
