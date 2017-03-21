pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                tool 'maven3'
                sh "${tool 'maven3'}/bin/mvn clean install"
            }
        }
    }
}