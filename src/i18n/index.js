import Vue from 'vue'
import VueI18n from 'vue-i18n'
import en from './en.json'
import nl from './nl.json'
import fr from './fr.json'

Vue.use(VueI18n)

var lang = window.localStorage.getItem('lang') || 'en';

export function createI18n () {
  return new VueI18n({
    locale: lang,
    messages: {
      'en': en,
      'nl': nl,
      'fr': fr
    }
  })
}
