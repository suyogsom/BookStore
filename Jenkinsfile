
pipeline {
    agent any
    stages {
        stage('build with unit test') {
            steps {
                sh 'mvn -f bookstore-server/pom.xml clean package'
            }
        }
        stage('integration test') {
            steps {
                sh 'mvn -f bookstore-integration-test/pom.xml clean test'
            }
        }
    }
}
