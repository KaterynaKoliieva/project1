package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = {"src/main/resources/authentication.feature","src/main/resources/registration.feature",},
        glue = "stepdefinitions",
        publish = true
)

public class RunnerTests {
}
