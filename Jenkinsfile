pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                dir('demo') {
                    sh 'mvn test'
                    
                }
            }
        }
    }

    post {
        always {
            // Archive the HTML report in the 'Demo/target/surefire-reports' directory
            archiveArtifacts 'demo/target/site/*.html'
        }
    }
}
