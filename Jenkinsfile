pipeline {
    agent any

    stages {
        stage('Build') {
            agent{
                docker{
                    image 'openjdk:17-jdk-slim'
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
