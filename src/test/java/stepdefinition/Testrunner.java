package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Selenium\\OrvisDev\\src\\test\\java\\objectrepository\\feature\\Register.feature",glue="org.sample",plugin={"html:target","json:target/report.json","rerun:src/test/resources/failed.txt"})

public class Testrunner {
	
}
