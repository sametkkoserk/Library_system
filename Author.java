package packag;

import java.text.DecimalFormat;

public class Author extends Person{
	public  String publisher;
	static DecimalFormat df=new DecimalFormat("#");


	public Author(String name, String publisher, int birthDate) {
		super(name,df.format(birthDate));
		try {
			method1(publisher);  
			this.publisher = publisher;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
	}
	void method1(String publisher) {
		if(publisher.length()<3) {
			throw new IllegalArgumentException("Publisher can not be shorter then three symbols");
		}
		
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String toString() {
		return  getName();
	}
	
}
