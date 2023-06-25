pipeline {
  agent any
  
  tools {
    maven "maven default"
  }
  
  stages {
    stage('Git fetch') {
      steps {
        git credentialsId: '678fc549-92c0-4ba2-9807-ce490e663bc5', url: 'https://github.com/PedroFedz/Practica05.git'
      }
    }
    
    stage('Compile, Test, Package') {
      steps {
        sh "mvn -f Sesion05pfs341/pom.xml clean package"
      }
      
      post {
        success {
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts '**/target/*.jar'
          jacoco(
            execPattern: '**/target/jacoco.exec',
            classPattern: '**/target/classes',
            sourcePattern: '**/src/',
            exclusionPattern: '**/test/'
          )
          publishCoverage adapters: [jacocoAdapter('**/target/site/jacoco/jacoco.xml')]
        }
      }
    }
    
    stage('Analysis') {
      steps {
        sh "mvn -f Sesion05pfs341/pom.xml site"
      }
      
      post {
        success {
          dependencyCheckPublisher pattern: '**/target/site/es/dependency-check-report.xml'
          recordIssues enabledForFailure: true, tool: checkStyle()
          recordIssues enabledForFailure: true, tool: pmdParser()
          recordIssues enabledForFailure: true, tool: cpd()
          recordIssues enabledForFailure: true, tool: findBugs()
          recordIssues enabledForFailure: true, tool: spotBugs()
        }
      }
    }
    
    stage ('Documentation') {
      steps {
	    sh "mvn -f Sesion05pfs341/pom.xml javadoc:javadoc javadoc:aggregate" 
      }
      post{
        success {
          step $class: 'JavadocArchiver', javadocDir: 'Sesion05pfs341/target/site/apidocs', keepAll: false 
          publishHTML(target: [reportName: 'Maven Site', reportDir: 'Sesion05pfs341/target/site', reportFiles: 'index.html', keepAll: false]) 
        }
      }
    }
    
  }
}
