pipeline {

    agent {
    	
    }

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
            steps {
            	echo 'This step sould be executed always...'
            }
        }
        success {
            steps {
            	echo 'If you see this line it means that every thing is ok.'
            }
        }
        failure {
            steps {
            	echo 'If you see this line it means that something bad happened!'
            }
        }
        // Add more post conditions as needed
    }
}
