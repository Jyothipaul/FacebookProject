package utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =".\\src\\test\\Features",

//        OR operation
//        tags = {"@one,@a,@b"},
//        AND operation
//        tags = {"@one","@a"},
        tags = {"@test"},
        glue={"steps"},

        //format = {"json:target/cucumber.json" +
        //        ""}
        plugin = { "pretty", "html:target/cucumber-reports.html" }
//        plugin = { "pretty", "json:target/cucumber.json" }
        )

public class TestRunner {
}
