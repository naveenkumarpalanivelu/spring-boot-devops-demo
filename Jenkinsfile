pipeline {
    agent any
    environment {
        PATH = "/opt/maven/bin:${env.PATH}"
    }
    stages {
        stage ("Maven: Clean and Install") {
            steps {
                sh 'mvn clean install'
            }
        }
        stage ("Maven: Build Artifact") {
            steps {
                sh 'mvn package'
            }
        }
    }
}