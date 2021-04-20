package searchtest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_search {
	String titleb, authorb,isbnb,sigb;
	book b;
	String s,s1,s3,s4; 
	int n,n1,n2;
	public test_search(book bo) {
		b=bo;
	}

@Given("There's  a book with title {string}")
public void there_s_a_book_with_title(String string) {
    titleb =string ;
}

@When("I search through a book with first case   {string}")
public void i_search_through_a_book_with_first_case(String string) {
	  s=  b.searchbyname(string);
}

@Then("the first result should be printed")
public void the_first_result_should_be_printed() {
	  assertEquals(s.equals(titleb));
  	System.out.println( titleb );
}

@When("I search through a book with  second case {string}")
public void i_search_through_a_book_with_second_case(String string) {
	  s=  b.searchbyname(string);
}

@When("I search through a book with third case {string}")
public void i_search_through_a_book_with_third_case(String string) {
	 s=  b.searchbyname(string);
}

@When("I search through a book with this case {string}")
public void i_search_through_a_book_with_this_case(String string) {
	 s=  b.searchbyname(string);
}

@Then("there is no result")
public void there_is_no_result() {
	 assertNotEquals(s.equals(titleb));
	 System.out.println( "No books match the criteria" );
}

@Given("There's  a book with title  has {string}")
public void there_s_a_book_with_title_has(String string) {
  titleb=string;
}

@When("I search through a book list")
public void i_search_through_a_book_list() {
   n2=b.search_count_title(titleb);
}

@Then("the all result should be printed")
public void the_all_result_should_be_printed() {
	  assertTrue(n2>=1);
	System.out.println( "All book are printed" );
}

@Given("a book authore name is {string}")
public void a_book_authore_name_is(String string) {
	authorb=string;
}

@When("I search through a book by its writer first case  {string}")
public void i_search_through_a_book_by_its_writer_first_case(String string) {
	 s1=b.searchbyauthor(string);
}

@Then("only one  result of it  should be printed")
public void only_one_result_of_it_should_be_printed() {
	 assertEquals(s1.equals(authorb) );
 	System.out.println( authorb );
}

@When("I search through a book by its writer second case {string}")
public void i_search_through_a_book_by_its_writer_second_case(String string) {
	 s1=b.searchbyauthor(string);
}

@When("I search through a book by its writer name with this third case {string}")
public void i_search_through_a_book_by_its_writer_name_with_this_third_case(String string) {
	 s1=b.searchbyauthor(string);
}

@When("I search through a book by its writer name  {string}")
public void i_search_through_a_book_by_its_writer_name(String string) {
	 s1=b.searchbyauthor(string);
}

@Then("there is no books")
public void there_is_no_books() {
	 assertNotEquals(s1.equals(authorb) );
	 System.out.println( "No books match the criteria" );
}

@Given("a book authore name has substring like {string}")
public void a_book_authore_name_has_substring_like(String string) {
 authorb=string;
}

@When("I search through many books")
public void i_search_through_many_books() {
    n1=b.search_count_author(authorb);
}
@Then("all  results of it  should be printed")
public void all_results_of_it_should_be_printed() {
	 assertTrue(n1>=1 );
	 	System.out.println( "All Books printed" );
}

@Given("a book isbn is {string}")
public void a_book_isbn_is(String string) {
	isbnb=string;
}

@When("I search through a book by its isbn like {string}")
public void i_search_through_a_book_by_its_isbn_like(String string) {
	  s3=b.searchbyisbn(string);
}

@Then("One result should be printed")
public void one_result_should_be_printed() {
	assertEquals(s3.equals(isbnb) );
	System.out.println( isbnb );
}

@When("I search through a book by its isbn {string}")
public void i_search_through_a_book_by_its_isbn(String string) {
	  s3=b.searchbyisbn(string);
}

@When("I search through a book by its isbn the entered isbn {string}")
public void i_search_through_a_book_by_its_isbn_the_entered_isbn(String string) {
	s3=b.searchbyisbn(string);
}

@Then("there is no book with this isbn")
public void there_is_no_book_with_this_isbn() {
	assertNotEquals(s3.equals(isbnb) );
	System.out.println( "No books match the criteria" );
}

@Given("a book signature is {string}")
public void a_book_signature_is(String string) {
	 sigb=string;
}

@When("I search through a book by its signature {string}")
public void i_search_through_a_book_by_its_signature(String string) {
    s4=b.searchbysig(string);
}

@Then("One result printed")
public void one_result_printed() {
	assertEquals(s4.equals(sigb) );
	System.out.println( sigb );
}

@When("I search through a book by its signature1 {string}")
public void i_search_through_a_book_by_its_signature1(String string) {
	s4=b.searchbysig(string);
}

@When("I search through a book by its signature2 {string}")
public void i_search_through_a_book_by_its_signature2(String string) {
	s4=b.searchbysig(string);
}

@Then("there is no book with this signature")
public void there_is_no_book_with_this_signature() {
	assertNotEquals(s4.equals(sigb) );
	System.out.println( "No books match the criteria" );
}

@Given("a book signature has a substring  {string}")
public void a_book_signature_has_a_substring(String string) {
   sigb=string;
}

@When("I search through a books")
public void i_search_through_a_books() {
   n=b.search_cout_sig(sigb);
}

@Then("many results printed")
public void many_results_printed() {
	assertTrue( n>=1);
	System.out.println( "All Book printed" );
}
@Given("admin given a book with isbn  {string}")
public void admin_given_a_book_with_isbn(String string) {
	isbnb=string;
}

@When("admin search through a book by its isbn like {string}")
public void admin_search_through_a_book_by_its_isbn_like(String string) {
	s3=b.searchbyisbn(string);
}

@Then("the search Done successfully")
public void the_search_done_successfully() {
	assertEquals(s3.equals(isbnb) );
	System.out.println( "The searching process successfully done while admin login" );
}
@Given("someone given a book with isbn  {string}")
public void someone_given_a_book_with_isbn(String string) {
	isbnb=string;
}

@When("he search through a book by this  isbn like {string}")
public void he_search_through_a_book_by_this_isbn_like(String string) {
	s3=b.searchbyisbn(string);
}

@Then("the search Done without mistake")
public void the_search_done_without_mistake() {
	assertEquals(s3.equals(isbnb) );
	System.out.println( "The searching process successfully done while admin logout" );
}
}
