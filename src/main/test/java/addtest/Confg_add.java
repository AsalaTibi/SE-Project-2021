package addtest;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions( features="Cases_Features/addfeature.feature",glue="addtest")
public class Confg_add {

}
