package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html"}, // plugin={"html:target\\cucumber-reports.html"}
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@tutorialNinja", /// @All butun taglari calistirir.
        dryRun = false
)
public class TutorialNinjaRunner {


}
