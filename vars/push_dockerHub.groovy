def call(String image, String imageTag){
  withCredentials([usernamePassword(credentialsId:"DockerHubCred",
                    passwordVariable:"DockerHubPass", usernameVariable:"DockerHubUser")]){
                    sh "docker login -u ${env.DockerHubUser} -p ${env.DockerHubPass}"
                    sh "docker push ${env.DockerHubUser}/${image}:${imageTag}"
  }
}
