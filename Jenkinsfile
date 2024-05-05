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
                sh "mvn install"
            }
        }
        stage('MVN Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Deploy'){
            steps{
                sh 'mvn deploy'
            }
        }

    }
    post{
        always{
            junit 'target/surefire-reports/TEST-MainTest.xml'
        }
    }
}

