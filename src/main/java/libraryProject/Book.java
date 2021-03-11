package libraryProject;

import java.util.ArrayList;

public class Book {
private String Title;
private String Author;
private String Signiture;
private String ISBN;
int flage=1;

ArrayList<Book> items=new ArrayList<Book>();
Book(){
Title=null;
Author=null;
Signiture=null;
ISBN = null;
}

public void addbook(String isbn,String title,String author,String sig) {
	// first checking the isbn if it is valid or not 
	if(validISBN(isbn)) {
	System.out.println("Valid ISBN");
	
	//check if the book exist before
	for(int j=0;j<items.size();j++)
	{if(isbn.equals(items.get(j).ISBN))
	System.out.println("The book is exist you can not adde it");
	flage = 0;
	}
	
	if(flage == 1) {
	Book b1=new Book();
	b1.ISBN=isbn;
	b1.Author=author;
	b1.Signiture=sig;
	b1.Title=title;
	
	//add the book to the arraylist
    items.add(b1);
	}}
	else
		System.out.println("Invalid ISBN");
	
}

private boolean validISBN(String isbn) {
	int sum =0;
	char charArray[]= new char[isbn.length()];
	isbn.getChars(0,isbn.length(), charArray, 0);
	for (int i=0;i<isbn.length();i++) {
		sum +=(charArray[i]*(10-i));
		}
		if(sum % 11 == 0)
		return true;
		else 
		return false;
}

}
