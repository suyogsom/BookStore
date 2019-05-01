node{

		stage('SCM checkout'){
		git 'https://github.com/suyogsom/BookStore'
		}


        stage ('Build') {
         def mvnHome = tool name: 'maven-3.6.0', type: 'maven'
         sh "${mvnHome}/bin/mvn package"
        }
    }
  
