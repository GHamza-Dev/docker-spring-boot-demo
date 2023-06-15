pipeline {

    agent any

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

    post{
        always{
            echo "Hello from Jenkins build logs"
            slackSend channel: '#test',
            message: "*${currentBuild.currentResult}:* Job ${env.JOB_NAME} build ${env.BUILD_NUMBER} by ${env.BUILD_USER}\n More at: ${env.BUILD_URL}"
        }
    }

}
