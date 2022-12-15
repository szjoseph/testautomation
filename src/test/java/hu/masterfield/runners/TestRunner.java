package hu.masterfield.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
//        features = "@target/cucumber-rerun.txt"
//        tags = "@Search or @TC05",
        publish = true,
        glue = {"hu.masterfield.steps"},
        plugin = {"pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports.json",
                "rerun:target/cucumber-rerun.txt",
                "junit:target/cucumber-reports.xml"})
public class TestRunner {
}