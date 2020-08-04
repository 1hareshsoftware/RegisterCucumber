package org.example;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".",
        tags = "@register",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cukeReport"})

public class RunClass {
}
