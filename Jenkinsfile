pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk'
        }
    stages {
        stage('MVN Install') {
            steps {
                sh 'mvn --version'
                sh 'java --version'
                sh "mvn compile"
            }
        }
        stage('MVN Test') {
            steps {
                sh "mvn test"

            }
        }

    }
    post{
        always{
            junit 'target/surefire-reports/TEST-MainTest.xml'
        }
    }
}

