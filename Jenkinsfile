pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                tool 'maven3'
                sh 'mvn clean install'
            }
        }
    }
}