pipeline {
    agent any   
    stages {
        stage('Fetch Code') {
            steps {
                git 'https://github.com/Gurudath-S/devops.git'
            }
        }
         
        stage('Build and Test') {
            steps {
                bat 'mvn clean install'
            }
        }
        
        stage('Deploy to Tomcat') {
            steps {
                bat '"C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\bin\\shutdown.bat" -port 8050'
                bat 'copy target/devops.war "C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\webapps\\"'
                bat '"C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\bin\\startup.bat"'
            }
 }
}
}