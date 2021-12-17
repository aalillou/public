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

      def shellCmd = "bash ./server-cmds.sh ${IMAGE_NAME}"

      def DEPLOY_USER = "gitlab"
      def DEPLOY_SERVER = "aws.moway.be"

      echo "ssh ${DEPLOY_USER}@${$DEPLOY_SERVER}"

      // sh 'ssh -o StrictHostKeyChecking=no -l cloudbees 192.168.1.106 uname -a'
      // ssh $DEPLOY_USER@$DEPLOY_SERVER "cd $DEPLOY_DEST && docker-compose up -d"
  }

}

return this
