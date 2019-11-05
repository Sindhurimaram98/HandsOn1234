package runnerHandson;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\JENKINS\\cucjenkins23\\cucjenkins23\\features\\testmeapp.feature",
glue= {"stepdefhandson"},
monochrome=true,
plugin= {"pretty","json:target/cucumber.json"}
)
public class TestRunner {

}
