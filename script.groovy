def buildApp() {
    echo "building the application... 2"
}

def testApp() {
    echo "testing the application..."
}

def buildImage() {
    echo "building the docker image..."
}

def deployApp() {
  echo 'deploying the application...SSH'

  sshagent(credentials: ['SSH_PRIVATE_KEY']) {
      echo "conneting with SSH_PRIVATE_KEY"
  }

}

return this
