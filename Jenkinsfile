pipeline {
    agent any
    environment {
        PATH+EXTRA = '/opt/maven/bin'
    }
    stages {
        stage ("install maven dependencies") {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}