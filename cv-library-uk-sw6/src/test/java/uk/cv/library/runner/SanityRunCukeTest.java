package uk.cv.library.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",//feature path
        glue = "uk/cv/library/steps",//steps folder path
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@sanity"
)

public class SanityRunCukeTest extends AbstractTestNGCucumberTests {
}
