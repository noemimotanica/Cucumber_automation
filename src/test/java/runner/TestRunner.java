package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/npohrib/IdeaProjects/Cucumber/src/test/java/features",
        glue = {"/Users/npohrib/IdeaProjects/Cucumber/src/test/java/stepDefinition","/Users/npohrib/IdeaProjects/Cucumber/src/test/java/utility"}
//        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json" }

)



public class TestRunner {


}
