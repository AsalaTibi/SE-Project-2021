package searchtest;

import java.io.IOException;
import java.util.ArrayList;

public class Book {
 

	private String title ;
	private String author ;
	private String isbn ;
	private String signature ;
	private String cons = "log.txt";
	int flage=1;
	Log myLog;
	ArrayList<Book> items = new ArrayList<Book>();
 public Book() {
		
	title="beautiful";
	author="hala";
	isbn="0131016490";
	signature="hala2002";
	}

	public String searchName(String s) {
		Book b = new Book(); 
		items.add(b);
	
		String theName =s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).title.contains(theName)) {
			 back=items.get(i).title;
			 try {
				myLog= new Log(cons);
				 myLog.getLogger().info(getInfo(i));
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			break;
		 }
		
	}
	return back;
	}


	public String searchByAuthor(String s) {
		Book b = new Book(); 
		items.add(b);
	
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).author.contains(theName)) {
			 back=items.get(i).author;
			 try {
			 myLog= new Log(cons);
			 myLog.getLogger().info(back);
		     myLog.getLogger().info(getInfo(i));
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			 
			break;
		 }
		
	}
	return back;

	}


	public String searchByIsbn(String s) {
		Book b = new Book(); 
		items.add(b);
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).isbn.contains(theName)) {
			 back=items.get(i).isbn;
			 try {
				myLog= new Log(cons);
				myLog.getLogger().info(back);
				myLog.getLogger().info(getInfo(i));
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			break;
		 }
		
	}
	return back;
	}

	private String getInfo(int i) {
		return items.get(i).isbn+" "+items.get(i).author+" "+items.get(i).signature+" "+items.get(i).title;
	}


	public String searchBySig(String s) {
		Book b = new Book(); 
		items.add(b);
		
		String theName = s;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).signature.contains(theName)) {
			 back=items.get(i).signature;
			 try {
					myLog= new Log(cons);
					myLog.getLogger().info(back);
					 myLog.getLogger().info(getInfo(i));
				} catch (SecurityException e) {
					e.printStackTrace();}
			 catch (IOException e) {
					e.printStackTrace();
				}
			break;
		 }
		
	}
	return back;
	}


	public int searchCountSig(String sigb) {
		Book b = new Book(); 
		items.add(b);
		int count=0;
		String theName = sigb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).signature.contains(theName)) {
			 
			 back=items.get(i).signature;
			 try {
					myLog= new Log(cons);
					myLog.getLogger().info(back);
				
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			count++;
		 }
		
	}
	return count ;
	}


	public int searchCountAuthor(String authorb) {
		Book b = new Book(); 
		items.add(b);
		int count=0;
		String theName = authorb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).author.contains(theName)) {
			 back=items.get(i).author;
			 try {
					myLog= new Log(cons);
					myLog.getLogger().info(back);
					
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			count++;
		 }
		
	}
	return count ;
	}


	public int searchCountTitle(String titleb) {
		Book b = new Book(); 
		items.add(b);
		int count=0;
		String theName = titleb;
		String back="";
		for (int i = 0; i < items.size(); i++) {
		 if(items.get(i).title.contains(theName)) {
			 back=items.get(i).title;
			 try {
					myLog= new Log(cons);
					myLog.getLogger().info(back);
					
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			count++;
		 }
	}
	return count ;
	
	}


	public void addBook(String isbn2, String title2, String author2, String sig2) {
		if(validIsbn(isbn2)) {
		 try {
				myLog= new Log(cons);
				myLog.getLogger().info("Valid ISBN");
				
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		  checkMyisbn();

		  addIt(sig2);
		}	
	}


	private void addIt(String sig2) {
		if(flage == 1) {
			Book b1=new Book();
			b1.isbn=isbn;
			b1.author=author;
			b1.signature=sig2;
			b1.title=title;

		
		    items.add(b1);
			}
		
	}

	private void checkMyisbn() {
		for(int j=0;j<items.size();j++)
		{
			if(isbn.equals(items.get(j).isbn)) {
		
			 try {
					myLog= new Log(cons);
					myLog.getLogger().info("The book is exist you can not adde it");
					
				} catch (SecurityException e) {
					
				} catch (IOException e) {
					
				}
		            flage = 0;
		}
		}
		
	}

	private boolean validIsbn(String isbn2) {
		int sum =0;
		char[] charArray= new char[isbn2.length()];
		isbn2.getChars(0,isbn2.length(), charArray, 0);
		for (int i=0;i<isbn2.length();i++) {
			sum +=(charArray[i]*(10-i));
			}
		  boolean exp=(sum % 11 == 0);
		  return exp;
	}
}
