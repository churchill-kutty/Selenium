package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "src/test/java/AddCart_Book/AddCart.feature" },

		glue = "Steps",

		dryRun = true,

		snippets = SnippetType.CAMELCASE,

		monochrome = true, plugin = { "pretty", "html:reports", "json:reports/result.json","junit:reports.xml" }
		
		

)

public class Runner_Class_AddCart_Book  extends AbstractTestNGCucumberTests{

}
