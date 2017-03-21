pipeline {
    agent any
    stages {
        stage('build') {
            env.PATH = "${tool 'maven3'}/bin:${env.PATH}"
            steps {
                sh 'mvn clean install'
            }
        }
    }
}