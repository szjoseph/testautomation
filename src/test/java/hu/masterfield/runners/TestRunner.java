package hu.masterfield.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        //        features = "@target/cucumber-rerun.txt"
        glue = "hu.masterfield.cucumber.steps",
        plugin = {"pretty", "json:target/cucumber-reports.json",
                "junit:target/cucumber-reports.html",
                "rerun:target/cucumber-rerun.txt",
                "junit:target/cucumber-rep"})
public class TestRunner {
}