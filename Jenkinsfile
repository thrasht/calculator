pipeline {
     agent any
     stages {
          stage("Code Coverage") {
            sh "./gradlew test jacocoTestReport"
            publishHTML (target: [reportDir: 'build/reports/jacoco/test/html',
            reportFiles: 'index.html',
            reportName: "JaCoCo Report"
            ])
            sh "./gradlew test jacocoTestCoverageVerification"
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