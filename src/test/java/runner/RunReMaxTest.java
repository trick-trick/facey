package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(   format = { "pretty", "html:target/cucumber" },
                    glue = "smoke",
                    features = "src/test/resources/features")

public class RunReMaxTest {
}
