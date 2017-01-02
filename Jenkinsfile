dockerNode(image: "jacekmarchwicki/android", sideContainers: ["selenium/standalone-firefox"]) {
  
  checkout scm
  echo "Building with grails"
  
  sh "chmod +x gradlew"
  sh "./gradlew clean"
  
}
