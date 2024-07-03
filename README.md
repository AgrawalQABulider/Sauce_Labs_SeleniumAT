**Hybrid framework with Page object Model intergated with TestNG**.
First of all, I have created the Page Layer.
were, I have created 3 pages of java class for example LoginPage.java
And for each page Actions/methods defined.
Then, naming convention point of view created Object repository for all pages.
Second,I have created Test layer.
Were, I have created 3 Test layer for example LoginPageTest.java.
And all test layer wriiten by using TestNG-annotations.
But before doing all the above step first need to create TestBase.java(parent class).
Basically, all page layer and Test Layer are the child class of TestBase.java.
I have created another layer called config.properties contains(url, username, password, browser, etc..)also called as Environment Variable.
Then, I have created Test.Util java file contains(page load
also created 
