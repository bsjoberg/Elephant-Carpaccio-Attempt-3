package fun.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/fun/bdd",
        glue = "src/test/java/fun/bdd"
)
public class RunCucumberTest {
}
