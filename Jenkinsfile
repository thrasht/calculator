pipeline {
     agent any
     stages {
          stage("Static code analysis") {
            steps {
                sh "./gradlew checkstyleMain"
                publishHTML (target: reportDir: 'build/reports/checkstyle',
                reportFiles: 'main.html',
                reportName: "Checkstyle Report"
                ])
            }
          }
          stage("Code Coverage") {
            steps {
                sh "./gradlew test jacocoTestReport"
                publishHTML (target: [reportDir: 'build/reports/jacoco/test/html',
                reportFiles: 'index.html',
                reportName: "JaCoCo Report"
                ])
                sh "./gradlew test jacocoTestCoverageVerification"
            }
          }
          stage("Compile") {
              steps {
                  sh "./gradlew compileJava"
              }
          }
          stage("Unit Test") {
              steps {
                  sh "./gradlew test"
              }
          }
     }
}