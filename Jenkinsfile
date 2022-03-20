pipeline {
    agent any
    environment {
        PATH = "/opt/maven/bin:${env.PATH}"
    }
    stages {
        stage ("install maven dependencies") {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}