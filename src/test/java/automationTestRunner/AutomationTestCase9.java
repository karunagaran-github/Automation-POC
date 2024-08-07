package automationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@nineth",features= {"src/test/resources/AutomationFeatures"},
glue={"automationStepDefinitions"},
plugin= {"pretty","html:target/htmlreport9.html"})


public class AutomationTestCase9 extends AbstractTestNGCucumberTests{

}
