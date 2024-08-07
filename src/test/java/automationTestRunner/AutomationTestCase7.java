package automationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@seventh",features= {"src/test/resources/AutomationFeatures"},
glue={"automationStepDefinitions"},
plugin= {"pretty","html:target/htmlreport7.html"})


public class AutomationTestCase7 extends AbstractTestNGCucumberTests{

}
