pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                def mvnHome = tool 'maven3'
                sh "${mvnHome}/bin/mvn clean install"
            }
        }
    }
}