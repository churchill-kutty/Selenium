package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/java/feature/login.feature" },

		glue = "Steps",

		dryRun =!true,

		snippets = SnippetType.CAMELCASE,

		monochrome = true, plugin = { "pretty", "html:reports", "json:reports/result.json","junit:reports.xml" },
		
		tags ={"@smoke"}

)

public class Runner_Class extends AbstractTestNGCucumberTests {

}
