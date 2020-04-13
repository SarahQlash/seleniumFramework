# seleniumFramework
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
	get your git bash where you want to clone the project on your local machine.
	then type:
```
git clone https://github.com/SarahQlash/seleniumFramework.git
```
* import the project into Eclipse by importing maven project.
* you can run the project directly through the Eclipse by running TCS by TestNG or Run the project by maven
* you can also run the test cases by getting the report directly through allure framework
* type in git bash after you select the project destination `allure -serve` then
```
allure.bat serve allure-results
```
allure-results this where the output of test

### Component of pages
	1- Page Base
	2- sign up page
	3- login page
	4- home page

### Component of tests
	1- Test base
	2- user sign up  with DDT by JSON >> user sign up then logout then login reading data from JSON file
	3- user sign up  with Faker lib >>  user sign up then logout then login reading data from Faker Lib
	4- get response body by RestAssured and save it in html file

### Component of utilities
	1- it's a helper take the screen shoot of failure

### Component of data
	it's a java classes for data read/write data

This is simple project for sige up using seleium framework , you can run the project on different browsers chrome ,firfox and ie .
