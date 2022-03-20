pipeline {
    agent any
    stages {
        stage ("install maven dependencies") {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}