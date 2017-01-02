dockerNode(image: "jacekmarchwicki/android", sideContainers: ["selenium/standalone-firefox"]) {
  
  stage "Commit stage" {
  
      stage "Checkout"
      checkout scm

      stage "Build/Analyse/Test" {
        echo "Building with grails"

        sh "chmod +x gradlew"
        sh "./gradlew clean"
      }
    
      stage "Integration tests" {
        echo "Integration tests"
      }
    
      stage "Code analysis" {
        echo "Code analysis"
      }

      stage "Assemble" {
        echo "Assemble"
      }
  }
  
  stage "Acceptance stage" {
    
      
    
  }
  
}
