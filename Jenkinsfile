pipeline {
    agent any

    stages {
        stage('Build') {
            agent{
                docker{
                    image 'openjdk:11'
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
