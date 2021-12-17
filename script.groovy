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
    withCredentials([usernamePassword(credentialsId: 'SSH_PRIVATE_KEY', passwordVariable: 'KEY', usernameVariable: 'USER')]) {
        echo "KEY: $KEY"
        echo "USER: $USER"
    }

}

return this
