def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "echo Maven validates compiles test and packages artifact"
       sh "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
     }
}
