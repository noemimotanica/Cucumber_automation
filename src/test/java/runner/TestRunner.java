package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "classpath:features",
//        glue = {"stepDefinition","utility"}
////        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json" }
//
//)
//
//
//
//public class TestRunner {
//
//
//}

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/example/features",
        glue = {"stepDefinition","utility"}
//        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json" }
)

public class TestRunner {}

