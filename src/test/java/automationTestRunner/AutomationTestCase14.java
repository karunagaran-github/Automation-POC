package automationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@fourteenth",features= {"src/test/resources/AutomationFeatures"},
glue={"automationStepDefinitions"},
plugin= {"pretty","html:target/htmlreport14.html"})


public class AutomationTestCase14 extends AbstractTestNGCucumberTests{

}
