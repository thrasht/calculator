pipeline {
     agent any
     stages {
          stage("Compile") {
              steps {
                  sh "./gradlew compileJava"
              }
          }
          stage("Test") {
              steps {
                  sh "./gradlew test"
              }
          }
     }
}