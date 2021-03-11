package searchtest;

import java.util.ArrayList;
import java.util.Scanner;

public class book {
 
	ArrayList<book> items = new ArrayList<book>();
	private String Title ;
	private String author ;
	private String isbn ;
	private String Signature ;
	public book() {
		
	Title="beautiful";
	author="hala";
	isbn="1152198745";
	Signature="hala2002";
	}


	public String searchbyname(String s) {
		// TODO Auto-generated method stub
		book b = new book(); 
		items.add(b);
	
		String theName =s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).Title.contains(theName)) {
			 back=items.get(i).Title;
			 System.out.println(items.get(i).Title+" "+items.get(i).isbn+" "+items.get(i).Signature+" "+items.get(i).author);
			break;
		 }
		
	}
	return back;
	}


	public String searchbyauthor(String s) {
		book b = new book(); 
		items.add(b);
	
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).author.contains(theName)) {
			 back=items.get(i).author;
			 System.out.println(items.get(i).author+" "+items.get(i).isbn+" "+items.get(i).Signature+" "+items.get(i).Title);
			break;
		 }
		
	}
	return back;

	}


	public String searchbyisbn(String s) {
		book b = new book(); 
		items.add(b);
	
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).isbn.contains(theName)) {
			 back=items.get(i).isbn;
			 System.out.println(items.get(i).isbn+" "+items.get(i).author+" "+items.get(i).Signature+" "+items.get(i).Title);
			break;
		 }
		
	}
	return back;
	}


	public String searchbysig(String s) {
		book b = new book(); 
		items.add(b);
		//System.out.println( "Please enter the isbn:" );
		//Scanner input = new Scanner( System.in );
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).Signature.contains(theName)) {
			 back=items.get(i).Signature;
			 System.out.println(items.get(i).Signature+" "+items.get(i).isbn+" "+items.get(i).author+" "+items.get(i).Title);
			break;
		 }
		
	}
	return back;
	}


	public int search_cout_sig(String sigb) {
		book b = new book(); 
		items.add(b);
		int count=0;
		String theName = sigb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).Signature.contains(theName)) {
			 back=items.get(i).Signature;
			count++;
		 }
		
	}
	return count ;
	}


	public int search_count_author(String authorb) {
		book b = new book(); 
		items.add(b);
		int count=0;
		String theName = authorb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).author.contains(theName)) {
			 back=items.get(i).author;
			count++;
		 }
		
	}
	return count ;
	}


	public int search_count_title(String titleb) {
		book b = new book(); 
		items.add(b);
		int count=0;
		String theName = titleb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).Title.contains(theName)) {
			 back=items.get(i).Title;
			count++;
		 }
		
	}
	return count ;
	
	}





	
	
}
