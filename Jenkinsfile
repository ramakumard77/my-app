pipeline {
    agent {
        docker {
            image "maven"
            args '-v $HOME/.m2:/root/.m2'
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
