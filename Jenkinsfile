pipeline{
    agent any

    stages{
        stage('Clone Git'){
            steps{
                git 'https://github.com/Tejinder7/JenkinsDemo.git'
            }
        }
        stage('Maven Build'){
            steps{
                sh 'mvn clean install'
            }
        }
    }
}