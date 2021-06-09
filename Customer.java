package packag;
import java.text.DecimalFormat;
public class Customer extends Person {
	
	private String address="-";
	private Book borrowedBook;
	private boolean borrowABook=false;
	static DecimalFormat df=new DecimalFormat("#");
	
	public Customer(String name, String birthPlace, int birthDate, String address) {
		super(name, df.format(birthDate),birthPlace);
		try {
			method1(address);  
			this.address = address;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		
	}
	
	public Customer(String name, int birthDate, String address) {
		
		super(name,df.format(birthDate));
		try {
			method1(address);  
			this.address = address;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
	}
	
	public Customer(String name, String address) {
		
		super(name);
		try {
			method1(address);  
			this.address = address;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
	}
	void method1(String address) {
		if(address.length()<3) {
			throw new IllegalArgumentException("Address can not be shorter then three symbols");
		}
		
	}
	
	public Customer(String name, int birthDate) {
		
		super(name, df.format(birthDate));
		
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book getBorrowedBook() {
		return borrowedBook;
	}

	public void setBorrowedBook(Book borrowedBook) {
		this.borrowedBook = borrowedBook;
	}

	public boolean isBorrowABook() {
		return borrowABook;
	}

	public void setBorrowABook(boolean borrowABook) {
		this.borrowABook = borrowABook;
	}

	public String toString() {
		return "Name: "+getName() + ", Birth Date: " + getBirthDate() + ", Birth Place: " + getBirthPlace() + "\nAddress: " + this.address;
	}
	

}