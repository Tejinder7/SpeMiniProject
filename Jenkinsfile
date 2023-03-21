pipeline{
    agent any

    environment {
    	    registry = "tejinder7/calculatordevops"
    	    registryCredential = 'DockerHubId'
    	    dockerImage = ''
    }

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
        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry( '', registryCredential ) {
                            dockerImage.push()
                    }
                }
            }
        }
        stage('Clean Docker Image'){
            steps{
                sh 'docker rmi tejinder7/calculatordevops'
            }
        }
        stage('Deploy Image on client'){
            steps{
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'deploy.yml', sudoUser: null
            }
        }
    }
}