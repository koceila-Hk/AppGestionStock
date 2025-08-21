pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // code source
                git branch: 'main',
                    url: 'https://github.com/koceila-Hk/AppGestionStock.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
