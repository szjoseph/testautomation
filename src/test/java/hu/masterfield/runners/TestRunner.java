package hu.masterfield.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        //        features = "@target/cucumber-rerun.txt"
        publish = true,
        glue = {"hu.masterfield.steps"},
        plugin = {"pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports.json",
            //    "junit:target/cucumber-reports.html",
                "rerun:target/cucumber-rerun.txt",
                "junit:target/cucumber-rep"})
public class TestRunner {
}