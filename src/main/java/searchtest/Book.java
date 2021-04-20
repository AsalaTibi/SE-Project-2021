package searchtest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
 

	private String title ;
	private String author ;
	private String isbn ;
	private String signature ;
	int flage=1;

	ArrayList<Book> items = new ArrayList<Book>();
 public Book() {
		
	title="beautiful";
	author="hala";
	isbn="0131016490";
	signature="hala2002";
	}

	public String searchName(String s) {
		Log my_log;

		Book b = new Book(); 
		items.add(b);
	
		String theName =s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).title.contains(theName)) {
			 back=items.get(i).title;
			 try {
				my_log= new Log("log.txt");
				 my_log.logger.info(items.get(i).title+" "+items.get(i).isbn+" "+items.get(i).signature+" "+items.get(i).author);
			} catch (SecurityException e) {
				
			} catch (IOException e) {
				
			}
			
			break;
		 }
		
	}
	return back;
	}


	public String searchByAuthor(String s) {
		Log my_log;
		Book b = new Book(); 
		items.add(b);
	
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).author.contains(theName)) {
			 back=items.get(i).author;
			 try {
					my_log= new Log("log.txt");
					my_log.logger.info(back);
					 my_log.logger.info(items.get(i).author+" "+items.get(i).isbn+" "+items.get(i).signature+" "+items.get(i).title);
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}
			 
			break;
		 }
		
	}
	return back;

	}


	public String searchByIsbn(String s) {
		Book b = new Book(); 
		items.add(b);
	Log my_log;
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).isbn.contains(theName)) {
			 back=items.get(i).isbn;
			 try {
					my_log= new Log("log.txt");
					my_log.logger.info(back);
					 my_log.logger.info(items.get(i).isbn+" "+items.get(i).author+" "+items.get(i).signature+" "+items.get(i).title);
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}
			
			break;
		 }
		
	}
	return back;
	}


	public String searchBySig(String s) {
		Log my_log;
		Book b = new Book(); 
		items.add(b);
		
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).signature.contains(theName)) {
			 back=items.get(i).signature;
			 try {
					my_log= new Log("log.txt");
					my_log.logger.info(back);
					 my_log.logger.info(items.get(i).signature+" "+items.get(i).isbn+" "+items.get(i).author+" "+items.get(i).title);
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}
			
			
			break;
		 }
		
	}
	return back;
	}


	public int searchCountSig(String sigb) {
		Book b = new Book(); 
		Log my_log;
		items.add(b);
		int count=0;
		String theName = sigb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).signature.contains(theName)) {
			 
			 back=items.get(i).signature;
			 try {
					my_log= new Log("log.txt");
					my_log.logger.info(back);
				
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}
			count++;
		 }
		
	}
	return count ;
	}


	public int searchCountAuthor(String authorb) {
		Book b = new Book(); 
		Log my_log;
		items.add(b);
		int count=0;
		String theName = authorb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).author.contains(theName)) {
			 back=items.get(i).author;
			 try {
					my_log= new Log("log.txt");
					my_log.logger.info(back);
					
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}
			
			count++;
		 }
		
	}
	return count ;
	}


	public int searchCountTitle(String titleb) {
		Book b = new Book(); 
		items.add(b);
		Log my_log;
		int count=0;
		String theName = titleb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).title.contains(theName)) {
			 back=items.get(i).title;
			 try {
					my_log= new Log("log.txt");
					my_log.logger.info(back);
					
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}
			count++;
		 }
		
	}
	return count ;
	
	}


	public void addBook(String isbn2, String title2, String author2, String sig) {
	Log my_log;
		if(validIsbn(isbn)) {
		
		 try {
				my_log= new Log("log.txt");
				my_log.logger.info("Valid ISBN");
				
			} catch (SecurityException e) {
				
			} catch (IOException e) {
				
			}
		
		for(int j=0;j<items.size();j++)
		{
			if(isbn.equals(items.get(j).isbn)) {
		
			 try {
					my_log= new Log("log.txt");
					my_log.logger.info("The book is exist you can not adde it");
					
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}
		flage = 0;
		}
		}

		if(flage == 1) {
		Book b1=new Book();
		b1.isbn=isbn;
		b1.author=author;
		b1.signature=sig;
		b1.title=title;

	
	    items.add(b1);
		}}
		else

			 try {
					my_log= new Log("log.txt");
					my_log.logger.info("InValid ISBN");
					
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}	
	}


	private boolean validIsbn(String isbn2) {
		int sum =0;
		char charArray[]= new char[isbn2.length()];
		isbn2.getChars(0,isbn2.length(), charArray, 0);
		for (int i=0;i<isbn2.length();i++) {
			sum +=(charArray[i]*(10-i));
			}
			if(sum % 11 == 0)
			return true;
			else 
			return false;
	}
}
