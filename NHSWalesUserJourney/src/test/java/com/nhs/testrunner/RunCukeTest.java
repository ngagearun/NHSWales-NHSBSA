/**
 * 
 */
package com.nhs.testrunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @Arun Kumar V
 *  */
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resource/NHSfeatures",
                 glue = {"com.nhs.teststeps"},
                 plugin = { "pretty", "html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"},
                 monochrome = true)
public class RunCukeTest {
}


