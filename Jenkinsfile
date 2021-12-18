#!/usr/bin/env groovy

def gv

pipeline {
  agent { label 'aws' }
  stages {
    stage("init") {
      steps {
        script {
          gv = load "script.groovy"
        }
      }
    }
    stage("install") {
      steps {
        script {
          gv.installApp()
        }
      }
    }
    stage("build") {
      steps {
        script {
          gv.buildApp()
        }
      }
    }
    stage("test") {
      steps {
        script {
          gv.testApp()
        }
      }
    }
    stage("deploy") {
      steps {
        script {
          gv.deployApp()
        }
      }
    }
  }
}
