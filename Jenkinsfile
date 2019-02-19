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
                script {
                    def testResults = findFiles(glob: '*.xml')
                    for(xml in testResults) {
                        touch xml.getPath()
                    }
                }
            }
        }
        stage('---package---') {
            steps { 
                sh "mvn package"
            }
        }
    }
    
    post {
        always {
            junit '*.xml'
        }
    }
}
