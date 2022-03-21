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
        stage ("Upload artifact to S3 bucket") {
            steps {
                s3Upload entries: [[bucket: 'devops-artifacts-2022', excludedFile: '/target', selectedRegion: 'us-east-1', sourceFile: '**/target/spring-boot-devops-demo-0.0.1-SNAPSHOT.jar', storageClass: 'STANDARD', uploadFromSlave: false, useServerSideEncryption: false]], profileName: 'S3-Artifacts', userMetadata: []
            }
        }
    }
}