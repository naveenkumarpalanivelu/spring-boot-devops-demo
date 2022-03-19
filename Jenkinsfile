pipeline {
    agent any
    stages {
        stage ("Clean and Install maven dependencies") {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
