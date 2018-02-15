# ExpediaBackend

This the backend project that serves the Expedia App (the exercise)

## Project Setup
### Prerequisites
* Java JDK 8
* STS IDE
* Maven 3.x

### Steps
 - Download the code from Github
 - Open STS and import **expedia** project as a maven project.
	 - From Eclipse, goto File -> import.
	 - Type "Existing maven projects" -> click next.
	 - Click on browse to choose the root directory, choose the **expedia** directory.
	 - Click Finish.
 - Run a maven build for **expedia** from STS:
 	 - Right click **expedia** -> Maven -> Update Project
	 - Right click **expedia** -> Run  As -> Maven Build -> Set in the Goal field "clean package" -> Run.
	 - Right click **expedia** -> refresh.
 - Run the project:
	 - Right click **expedia** -> Run as -> Spring boot Application 
	 
 - Open the browser and hit: **(localhost:8080/hotels/deals?minTripStartDate=2018-02-23)**


