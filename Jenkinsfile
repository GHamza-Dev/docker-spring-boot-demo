pipeline {

    agent {
    	label "linux"
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
            script {
            	steps {
            	    echo 'This step sould be executed always...'
            	}
            }
        }
        success {
            script {
            	steps {
            	    echo 'If you see this line it means that every thing is ok.'
            	}
            }
        }
        failure {
            script {
            	steps {
            	    echo 'If you see this line it means that something bad happened!'
            	}
            }
        }
        // Add more post conditions as needed
    }
}
