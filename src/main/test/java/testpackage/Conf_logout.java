package testpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions( features="Cases_Features/logout.feature",glue="testpackage")

public class Conf_logout {

}
