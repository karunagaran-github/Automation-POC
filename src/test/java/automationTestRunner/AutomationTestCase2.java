package automationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@second",features= {"src/test/resources/AutomationFeatures"},
glue={"automationStepDefinitions"},
plugin= {"pretty","html:target/htmlreport2.html"})


public class AutomationTestCase2 extends AbstractTestNGCucumberTests{

}
