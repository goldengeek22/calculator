pipeline{
    agent any
    stages{
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
        stage("Code coverage"){
            steps {
                sh "./gradlew jacocoTestReport"
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
    }
}