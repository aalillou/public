<template>

  <div class="px-4">
    <v-divider class="mb-3"></v-divider>
    <v-row class="mb-1">
      <v-col cols="3" class="resume-title">{{ $t("resume.languages.title") }}</v-col>
      <v-col cols="9">
        <div v-for="(lang, i) in $t('resume.languages.lang')" :key="i" class="resume-text">{{ lang }}</div>
      </v-col>
    </v-row>
  </div>

</template>

<style lang="scss">
</style>
