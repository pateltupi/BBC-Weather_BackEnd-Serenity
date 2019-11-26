package uk.co.weather.bbc.sereniryapi.cucumber;
/*
 * Created By Trupti Patel
 */

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import uk.co.weather.bbc.sereniryapi.testbase.TestBase;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-reports"},
        tags = "@AUTOMATED",
        monochrome = true
)

public class CucumberRunner extends TestBase {
}
