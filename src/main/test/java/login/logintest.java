package login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintest {
	private  String userName = "admin";
	private String password = "1234";
	private String pracName;
	private String pracPass;

	Login user;

	@Given("admin have chosen to sign in")
	public void admin_have_chosen_to_sign_in() {
	    System.out.println("SIGN IN");
	}

	@When("admin enters {string} in username field and {string} in password field")
	public void admin_enters_in_username_field_and_in_password_field(String username, String password) {
		pracName=username;
		pracPass=password;
	  Login.adminlog(username,password);
	}

    @Then("admin should access to the home page")
    public void admin_should_access_to_the_home_page() {
    assertTrue(userName.equals(pracName)  && password.equals(pracPass));
    System.out.println("HOME PAGE");
     }

   @Then("admin gets login failed message")
   public void admin_gets_login_failed_message() {
	assertFalse(userName.equals(pracName) && password.equals(pracPass));
    System.out.println("The username or password is incorrect");
   }


}
