pipeline {
    agent {
        docker {
            image "127.0.0.1:maven"
        }
    }
    stages {
        stage('---clean---') {
            steps { 
                sh "mvn clean"
            }
        }
        stage('---test---') {
            steps { 
                sh "mvn test"
            }
        }
        stage('---package---') {
            steps { 
                sh "mvn package"
            }
        }
    }
}
