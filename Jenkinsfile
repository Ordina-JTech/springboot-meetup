pipeline {
    agent any
    stages {
        stage('configure') {
            steps {
                env.PATH="${tool ' maven3'}/bin:${env.PATH}"
            }
        }
        stage('checkout') {
            steps {
                git 'https://github.com/MichelSchudel/springboot-meetup.git'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}