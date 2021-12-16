<template>

  <div class="px-4">
    <v-divider class="mb-3"></v-divider>
    <v-row >
      <v-col cols="3" class="resume-title">{{ $t("resume.objective.title") }}</v-col>
      <v-col cols="9">
        <p class="resume-text">{{ $t("resume.objective.text") }}</p>
      </v-col>
    </v-row>

    <v-divider class="mb-3"></v-divider>

    <v-row >
      <v-col cols="3" class="resume-title">{{ $t("resume.skills.title") }}</v-col>
      <v-col cols="9">
        <p class="resume-text">{{ $t("resume.skills.frontend.text") }}</p>
      </v-col>
    </v-row>

    <v-divider class="mb-3"></v-divider>
  </div>
</template>

<style lang="scss">

</style>
