pipeline {

    stages {
        stage('build') {
            steps {
                echo 'Building the application...'
            }
        }
        stage('test') {
            steps {
                echo 'Testing the application...'
            }
        }
    }
    
    
    post {
        always {
            // Define actions that should always be performed
            // regardless of the pipeline status
        }
        success {
            // Define actions to be performed on successful completion of the pipeline
        }
        failure {
            // Define actions to be performed if the pipeline fails
        }
        // Add more post conditions as needed
    }
}
