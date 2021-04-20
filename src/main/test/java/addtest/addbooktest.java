package addtest;

import searchtest.book;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages.GherkinDocument.Feature.Background;
public class addbooktest {
	book b1;

	 private boolean login;

	 public addbooktest(){
		  b1=new book();
	  }

	@Given("admin have chosen to add book")
	public void admin_have_chosen_to_add_book() {
	 System.out.println("ADD BOOK");
	}

	@When("admin add {string} and {string} and {string} and {string} when he logged in")
	public void admin_add_and_and_and_when_he_logged_in(String isbn, String title, String author, String sig) {
		login=true;
		b1.addbook(isbn,title,author,sig);
	}

	@Then("The book is added")
	public void the_book_is_added() {
		 assertTrue(login);
		 System.out.println("ADDED BOOK");
	}

	@When("admin add {string} and {string} and {string} and {string} when he is not logged in")
	public void admin_add_and_and_and_when_he_is_not_logged_in(String isbn, String title, String author, String sig) {
		login=false;
	    System.out.println("YOU CAN NOT ADD A BOOK");
	}


	@Then("The book is not added")
	public void the_book_is_not_added() {
		assertFalse(login);
	}
}
