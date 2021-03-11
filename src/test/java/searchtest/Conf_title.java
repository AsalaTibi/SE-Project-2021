package searchtest;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions( features="Cases_Features/search.feature",glue="searchtest")
public class Conf_title {

}
