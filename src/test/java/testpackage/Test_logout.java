package testpackage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Test_logout {
	Logout_class logout; 
	int out, in;
	public Test_logout (Logout_class l) {
		logout=l;
	}
	@Given("Administrator is log in")
	public void administrator_is_log_in() {
	   in=1;
	}

	@When("Pressed logout")
	public void pressed_logout() {
	  out=logout.goout(in);
	}

	@Then("Admin logout")
	public void admin_logout() {
	    assertTrue(in==out);
	}
}
