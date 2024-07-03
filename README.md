**Hybrid framework with Page object Model intergated with TestNG**.
First of all, I have created the Page Layer(.
were, I have created 3 pages of java class for example LoginPage.java
And for each page Actions/methods defined.
Then, for naming convention point of view created Object repository for all pages.
Second,I have created Test layer.
Were, I have created 3 Test layer for example LoginPageTest.java.
And all test layer wriiten by using TestNG-annotations.
But before doing all the above step first need to create TestBase.java(parent class).
Basically, all page layer and Test Layer are the child class of TestBase.java.
after that, I have created another layer called config.properties file contains(url, username, password, browser, etc..)also called as Environment Variable.
Then, I have created Test.Util java file contains(page loadtime out and implicit wait)
To generate the ExtentReport, i have created the extentreport.java file.
In pom.xml file, I have added the all the dependencies like Selenium, TestNg, extentreport, webdrivermanager, etc...
I have created testng.xml file to run all testcases on one click.

Tool used:- Eclipse
Langauage used:- Java
