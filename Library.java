package packag;

import java.util.ArrayList;

public class Library {
	
	private String address;
	ArrayList<Book> books = new ArrayList<Book>();
	ArrayList<Dictionary> dictionaries = new ArrayList<Dictionary>();
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public Library(String address) {
		this.address = address;
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9 am to 5 pm.");
	}
	
	public void printAddress() {
		System.out.println(this.address);
	}
	
	public boolean addBook(Book book) {
		books.add(book);
		return true;
		
	}
	public boolean addBook(Dictionary dictionary) {
		dictionaries.add(dictionary);
		return true;
		
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void borrowBook(String bookName, String personName) {
		int num1=-3;
		int index=0;
		for(Customer the:customers) {
			if(personName==the.getName()) {
				num1=-2;
				if(the.isBorrowABook()==false) {
					num1=-1;
					break;
				}
			}
			index+=1;
		}
		int num=0;
		for(Book the:books) {
			if(the.getTitle()==bookName) {
				num=1;
				if(the.isBorrowed()==false  && num1==-1) {
					customers.get(index).setBorrowABook(true);
					customers.get(index).setBorrowedBook(the);
					System.out.println(personName+" succesfully borrowed "+bookName);
					the.borrowed();
					num=2;
					break;
					
				}
				
			}
		}
		if(num1==-3) {
			System.out.println("Sorry "+personName+" is not a customer");
		}
		else if(num==1) {
			if(num1==-2) {
				System.out.println("Sorry "+personName+" already borrowed a book");
			}
			else{
				System.out.println("Sorry, this book is already borrowed");
			}
		}
		if(num==0) {
			System.out.println("Sorry, this book is not in our catalog");
		}
		
		
	}
	
	public void returnBook(String personName) {
		int num1=-3;
		for(Customer the:customers) {
			if(personName==the.getName()) {
				num1=-2;
				if(the.isBorrowABook()==true) {
					num1=-1;
					the.setBorrowABook(false);
					the.getBorrowedBook().returned();
					System.out.println(the.getName()+" successfully returned "+ the.getBorrowedBook().getTitle());
							

							
						
					
				}
			}
		}

		
		if(num1==-3) {
			System.out.println("Sorry "+personName+" is not a customer");
		}

		if(num1==-2) {
			System.out.println("Sorry "+personName+" did not barrow a book");
		}

			
		

		
		
	}
	


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public void printAvailableBooks() {
		int num=0;
		int num1=0;
		for(Book the:books) {
			num+=1;
			if(the.isBorrowed()==false) {
				num1+=1;
				System.out.println("Book name is "+the.getTitle()+", Author is "+the.getAuthor());
			}
			
		}
		int number=0;
		for(Dictionary the:dictionaries) {
			number+=1;
			
			System.out.println("Dictionary name is "+the.getTitle()+", definitions: "+the.getDefinitions());
			
			
		}
		if(num==0 && number==0) {
			System.out.println("No book in catalog");
			
		}
		else if(num1==0 && number==0) {
			System.out.println("No avaliable book in catalog");
		}
	}


}
