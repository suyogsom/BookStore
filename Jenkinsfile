
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
                sh 'java -jar /Users/suyogsomavanshi/Desktop/Software/Jenkins/Jenkins_home/workspace/BookStore_test/bookstore_app/bookstore-server/target/bookstore-server-0.0.1-SNAPSHOT.jar'
                sh 'mvn -f bookstore_app/bookstore-integration-test/pom.xml clean test'
            }
        }
    }
}
