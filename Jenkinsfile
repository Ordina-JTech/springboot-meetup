pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh "${tool 'maven3'}/bin/mvn clean install"
            }
        }
    }
}