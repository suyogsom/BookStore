
pipeline {
    agent any
    stages {
        stage('build with unit test') {
            steps {
                sh 'mvn -f bookstore_app/bookstore-server/pom.xml clean package'
            }
        }
        stage('integration test') {
            steps {
                sh 'mvn -f bookstore_app/bookstore-integration-test/pom.xml clean test'
            }
        }
    }
}
