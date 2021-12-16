<template>
  <v-app>

    <resume />

  </v-app>
</template>

<script>

  import Resume from '@/components/resume/resume.vue';

  export default {
    components: {
      'resume': Resume
    },
    data: () => ({}),
    methods: {}
  }
</script>
