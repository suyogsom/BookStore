
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn -f bookstore_app/pom.xml clean verify'
            }
        }
    }
}
