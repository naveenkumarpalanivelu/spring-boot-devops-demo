pipeline {
    agent any
    stages {
        stage ("Clone Spring Boot app from Github") {
            steps {
                git credentialsId: 'Github', url: 'git@github.com:naveenkumarpalanivelu/spring-boot-devops-demo.git'
            }
        }
    }
}