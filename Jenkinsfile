pipeline {
    agent any
    environment {
        PATH = '/opt/maven/bin:$PATH'
    }
    stages {
        stage ("install maven dependencies") {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}