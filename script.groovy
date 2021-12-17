def buildApp() {
    echo "building the application... 2"
    sh "npm install"
    sh "npm run build"

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
      def DEPLOY_SOURCE = "dist"
      def DEPLOY_DEST = "/datadrive/www/${CLIENT}.be/test/"
      //def shellCmd = "cd $DEPLOY_DEST && docker-compose up -d"
      def shellCmd = "cd ${DEPLOY_DEST} && echo 'hello there' > from_jenkins.txt"

      sh "rsync -rav -e 'ssh -o StrictHostKeyChecking=no' --delete --rsync-path='mkdir -p ${DEPLOY_DEST} && rsync' ${DEPLOY_SOURCE} ${DEPLOY_USER}@${DEPLOY_SERVER}:${DEPLOY_DEST}"

      // sh "ssh -o StrictHostKeyChecking=no ${DEPLOY_USER}@${DEPLOY_SERVER} '${shellCmd}'"

      // sh 'ssh -o StrictHostKeyChecking=no -l cloudbees 192.168.1.106 uname -a'
      // ssh $DEPLOY_USER@$DEPLOY_SERVER "cd $DEPLOY_DEST && docker-compose up -d"
  }

}

return this
