pipeline {
    agent any
    stages {
        stage('build with unit test') {
            steps {
                sh 'mvn -f bookstore_app/bookstore-server/pom.xml clean package'
            }
        }
        stage('app running with integration') {
            steps {
                sh 'mvn -f bookstore_app/bookstore-integration-test/pom.xml clean test'
            }
        }
    }
}
