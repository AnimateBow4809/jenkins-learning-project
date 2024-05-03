pipeline {
    agent any

    stages {
        stage('Build') {
            agent{
                docker{
                    image 'eclipse-temurin:17-jre-focal'
                    reuseNode true
                }
            }
            steps {
               sh '''
                    echo "hi"

               '''
            }
        }
    }
}
