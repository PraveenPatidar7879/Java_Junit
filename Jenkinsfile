pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your version control system (e.g., Git)
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // Run Maven test command
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // Clean up or perform actions that should happen regardless of the build result
            echo 'Build completed!'
        }
    }
}
