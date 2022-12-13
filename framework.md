# Framework

### What is it?	

The framework is based on Maven.

I use JDK 11 and Selenium version 3.141.59.

I use cucumber (7.2.3) for test cases. It allows to implement Behavior Driven Development.

### Page Object Model (POM)

In my framework I use Page Object Model design pattern. I create [page class](src/test/java/org/playground/ai/pages/TestPage.java)  for modules of the application under test. Then I locate web elements and put related methods in each page. POM allows us to separate web elements and related methods from test codes.

### Features
Features directory in the framework contains cucumber feature file [task.feature](src/test/resources/features/task.feature)
written in gherkin syntax.

### Step definitions
[Step definitions](src/test/java/org/playground/ai/step_definitions/StepDefinitions.java) contain java implementations of gherkin test cases in feature file.

### How it works?
[CukesRunner](src/test/java/org/playground/ai/runner/CukesRunner.java) triggers the tests. Tags help to specify which tests to run. 

### Utilities
The framework has also utilities package which includes methods for helping test execution.
The utilities package contains three utility classes; [driver utilities](src/test/java/org/playground/ai/utilities/Driver.java), [browser utilities](src/test/java/org/playground/ai/utilities/BrowserUtils.java), and [configuration reader](src/test/java/org/playground/ai/utilities/ConfigurationReader.java).
In [driver utilities](src/test/java/org/playground/ai/utilities/Driver.java), Singleton design pattern is used to set up the Web Driver.
[BrowserUtils](src/test/java/org/playground/ai/utilities/BrowserUtils.java) contains general methods for my automation.
For clean coding I use [configuration properties](configuration.properties).

