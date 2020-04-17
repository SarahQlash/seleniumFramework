# Selenium Framework
     Simple Project using java ,Maven ,TestNG , allure , POM  and RestAssured using Data Driven framework in the project.

# Tech Stach :

  ``` Java ```
  ``` Maven ```
  ``` TestNG ```
  ``` Allure ```
  ``` RestAssured ```

## Getting Started
   These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

	- Eclipse
	- JDK to run the Eclipse
	- Git bash

### Installing and how it work
1- Get your git bash where you want to clone the project on your local machine.
	then type:
	
```
git clone https://github.com/SarahQlash/seleniumFramework.git
```
2- Inside Eclipse
```	
File -> Import -> Maven -> Existing Maven project
```
* You can run the project directly through the Eclipse by running Test cases by TestNG or Run the project by maven
* You can also run the test cases by getting the report directly through allure framework
* Type in git bash after you select the project destination `allure -serve` then
```
allure.bat serve allure-results
```
allure-results this where the output of test

### Component of pages
	1- Page Base contain all the common methods that will be used by home, sign up , login pages
	2- Sign up page 
	3- Login page
	4- Home page

### Component of tests
	1- Test base that will be as a base for all test classes 
	2- The user sign up  with DDT by JSON >> user sign up then logout then login reading data from JSON file
	3- The user sign up  with Faker lib >>  user sign up then logout then login reading data from Faker Lib
	4- Get response body by RestAssured and save it in html file

### Component of utilities
	1- It's a helper to take the screenshot of failures

### Component of data
	They are java classes for reading / writing the data

This is a simple project for test sign up ، login and logout  using selenium framework , you can run the project on different browsers as  chrome ,firefox and internet explorer by changing value in testing.xml file.
