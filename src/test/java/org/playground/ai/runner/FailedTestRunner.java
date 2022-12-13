package org.playground.ai.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="@target/rerun.txt",
        glue = "com/cydeo/crm/step_definitions"
)


public class FailedTestRunner {
}