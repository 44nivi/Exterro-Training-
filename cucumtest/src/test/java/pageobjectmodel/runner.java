package pageobjectmodel;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/demo1.feature",glue={"pageobjectmodel"},
monochrome=true,
plugin={"pretty","html:target/HtmlReports",
"pretty","json:target/JSONReports/report.json",
"pretty","junit:target/JUNITReports/report.xml"})
public class runner {

}
