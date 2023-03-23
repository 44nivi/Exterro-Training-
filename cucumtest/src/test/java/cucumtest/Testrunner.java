package cucumtest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/resources/Feature/logindemo1.feature",glue={"cucumtest"},
monochrome=true,
plugin={"pretty","html:target/HtmlReports",
"pretty","json:target/JSONReports/report.json",
"pretty","junit:target/JUNITReports/report.xml"})
public class Testrunner {

}
