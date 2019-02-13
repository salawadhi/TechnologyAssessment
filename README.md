# TechnologyAssessment
Restful Web Service for Technology Assessment - Back End
The UML Class diagram can be found in /TechnologicalAssessmentUML

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
Necessary software to run the application as well as 

```
Maven (https://maven.apache.org/)
Sonar (https://www.sonarqube.org/)
```

### Installing
To be able to run the application please begin by installing Maven:

```
Install Maven (https://maven.apache.org/install.html)
```
To build the application quickly without re-compiling test classes, run the maven script:

```
mvn clean install -DskipTests
```

If you wish to run the application from the command line after installing maven enter the following in a command prompt while in the project folder:

```
mvn spring-boot:run
```

To be able to generate reports from SonarQube please:

```
Install SonarQube("https://docs.sonarqube.org/latest/setup/get-started-2-minutes/")
```

After installing SonarQube you can view pre-generated reports from the project folder by running the command:

```
mvn sonar:sonar -Dsonar.analysis.mode=preview -Dsonar.issuesReport.html.enable=true
```

Or viewing the file:

```
SonarQubeReport.html
```

If there are any issues with the above command, going to localhost:9000 after starting the SonarQube StartSonar.bat file and following the directions to add a project will generate a new report.

After running the program from the command line go to localhost:8080/api/get-discounted-receipt using any REST client you prefer, such as Postman.

A sample request body looks like :

```
{
	"customer":"affiliate",
	"time_as_customer":2,
	"items":[
		{
			"type":"grocery",
			"value":"19.99"
		},
			{
			"type":"other",
			"value":"20"
		},
			{
			"type":"grocery",
			"value":"6.99"
		},
			{
			"type":"grocery",
			"value":"14"
		},
			{
			"type":"other",
			"value":"5.5"
		},
			{
			"type":"other",
			"value":"15.99"
		},	{
			"type":"other",
			"value":"30"
		}
	]
}
```

Which will give a response like this:

```
{
  "customer_type" : "affiliate",
  "original_amount" : "112.47",
  "discounted_amount" : "12.15",
  "final_amount" : "100.32"
}
```

## Running the tests
To run the unit tests for the application enter the following command at the root of the project

```
mvn test
```

## Deployment
The application can be deployed to a TomCat server by copying the WAR file from target/TechnologyAssessment-0.0.1-SNAPSHOT.war to the tomcat/webapps/ folder, and then running:

```
catalina.bat (on Windows)
catalina.sh (on Unix-based systems)
```

## Built With
* [SpringBoot](http://start.spring.io) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency management
* [EvoSuite](http://www.evosuite.org) - Automated unit test generation and code coverage
* [SonarQube](https://www.sonarqube.org/) - Static code analysis tool
* [StarUML](http://staruml.io/) - Online and desktop based CASE tool

## Authors
* **Saud Al Awadhi** - (https://github.com/salawadhi)
