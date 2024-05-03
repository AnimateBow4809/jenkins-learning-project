pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk'
        }
    stages {

        stage('Build') {
            steps {
                sh 'mvn --version'
                sh 'java --version'
            }
        }
    }
}

