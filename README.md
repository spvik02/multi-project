# multi-project

first part: 
https://github.com/spvik02/utils

Run project:

./gradlew run

When Task :api:run is completed the result of Utils.isAllPositiveNumbers("12", "79") will be printed 

Create a project multi-project with two subprojects core and api.
The core subproject should contain class Utils with method boolean isAllPositiveNumbers(String... str).
Use utils-1.3.5.jar from the previous task to implement this method.
The api subproject should contain class App with the main method.
Call Utils.isAllPositiveNumbers("12", "79") from the main method of api subproject.
