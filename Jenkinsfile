pipeline{
	agent any
	stages {
        stage('Compile'){
			    steps{
        		bat """
					    cd HospitalSystemV2
					    mvn clean compile
				    """
			    }
		    }
		    stage('Build'){
			    steps{
        		bat """
					    cd HospitalSystemV2
					    mvn clean install
				    """
			    }
		    }
		    stage('Deploy'){
			    steps{
				    bat """
					    cd HospitalSystemV2
					    copy /y target\\HospitalSystemV2-1.0-SNAPSHOT.war "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps"
					    echo "-----------------------Deployment Done ---------------------------------"
					    echo "View App deployed here: http://localhost:8181/HospitalSystemV2-1.0-SNAPSHOT/index.jsp"
					    echo "--------------------------------------------------------"
				    """
			    }
		    }
		    stage('Smoke Test'){
			    steps{				
				    bat """
					    cd Selenium-Integration-Test
					    java org.testng.TestNG testng.xml
					    pause
				    """
			    }
		    }		
	  }
}
