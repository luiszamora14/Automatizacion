package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "definitions",
tags = "@regresion", plugin = {"json:target/cucumber-report/cucumber.json"})
public class runtest {
}
