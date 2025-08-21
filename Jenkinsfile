pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('Checkout GIT') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/koceila-Hk/AppGestionStock.git'
            }
        }

        stage('Testing maven') {
            steps {
                sh """mvn --version"""
            }
        }

        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
