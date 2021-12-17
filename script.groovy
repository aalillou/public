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

      def DEPLOY_USER = "gitlab"
      def DEPLOY_SERVER = "aws.moway.be"
      def CLIENT = "aalillou"
      def DEPLOY_DEST = "/datadrive/www/${CLIENT}.be/admin/"
      def shellCmd = "cd $DEPLOY_DEST && docker-compose up -d"

      echo "ssh ${DEPLOY_USER}@${$DEPLOY_SERVER} '$shellCmd'"

      // sh 'ssh -o StrictHostKeyChecking=no -l cloudbees 192.168.1.106 uname -a'
      // ssh $DEPLOY_USER@$DEPLOY_SERVER "cd $DEPLOY_DEST && docker-compose up -d"
  }

}

return this
