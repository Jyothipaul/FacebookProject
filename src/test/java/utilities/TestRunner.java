package utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//        dryRun - checks if all the step definitions are defined
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

//        strict - always set to false - this will fail at execution if ant step definition is not defined
        )

public class TestRunner {
}

// ToolsQA: Cucumber Options