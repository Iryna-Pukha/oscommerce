software versions:

	OS: Windows 8 Professional
	Browser: Google Chrome 67.0.3396.79
	JDK: jdk1.8.0_171
	JRE: jre1.8.0_171
	Maven: Apache Maven 3.5.3
	Tests are developed in Eclipse Java EE IDE (Oxygen.3a Release (4.7.3a))

Prior to run test cases:

	Cucumber Plugin needs to be installed (for eclipse - I have used version 0.0.21.201802160922)
	Download chromedriver for your OS: https://chromedriver.storage.googleapis.com/index.html?path=2.40/
	note, in this repository you can find uploaded webdriver for Windows OS
	
Test Files description:

	CheckOut1.feature file contains gherkin steps for adding product to the cart
	AddToCartTest.java file contains corresponding code for execution gherkin steps
	RunTest.java is needed for execution tests in command line and with Junit

Test Case execution:

	You need to run CheckOut1.feature as Cucumber Feature
	or
	Open cmd -> navigate to project folder (contains pom.xml) -> execute vommand 'mvn clean test'
