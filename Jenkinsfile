pipeline{
    agent any
    stages{
        stage("Check Git"){
        steps{
            sh "which git"
            }
        }
        stage("Compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }
        stage("Test"){
            steps{
                sh "./gradlew test"
            }
        }
    }
}