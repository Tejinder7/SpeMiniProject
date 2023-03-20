pipeline{
    agent any

    stages{
        stage('Clone Git'){
            steps{
                git 'https://github.com/Tejinder7/SpeMiniProject.git'
            }
        }
        stage('Maven Build'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('Test'){
            steps{
                echo "This is test stage"
            }
        }
    }
}