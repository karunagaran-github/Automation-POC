package automationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@twentysecond",features= {"src/test/resources/AutomationFeatures"},
glue={"automationStepDefinitions"},
plugin= {"pretty","html:target/htmlreport22.html"})


public class AutomationTestCase22 extends AbstractTestNGCucumberTests{

}
