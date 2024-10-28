package Runner_Class_Meesho;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = { "src/test/java/Meesho/Meesho.feature" },

		glue = "Steps_Messho",

		dryRun = !true,

		snippets = SnippetType.CAMELCASE,

		monochrome = true,

		plugin = { "pretty", "html:reports", "json:reports/result.json","junit:reports.xml" }



		)
public class Runner_Meesho extends AbstractTestNGCucumberTests {


}
