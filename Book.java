package packag;


public class Book {
	private int id;
	private String title;
	private Author author; //Author class ýnýn objesi olucak
	private boolean borrowed=false;

	public Book(int id, String title, Author author)  {
		
		try {
			method1(id);  
			this.id = id;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		try {
			method1(title);  
			this.title = title;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}

		
		
		this.author = author;
		
	}
	public Book(int id, String title) {
		
		try {
			method1(id);  
			this.id = id;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		try {
			method1(title);  
			this.title = title;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		
	}
	void method1(int id) {
		if(id<0) {
			throw new IllegalArgumentException("Id can not be less then zero");
		}
		
	}
	void method1(String title) {
		if(title.length()<3) {
			throw new IllegalArgumentException("Title can not be shorter then three symbols");
		}
		
	}
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public boolean isBorrowed() {
		return borrowed;
	}
	
	public boolean borrowed() {
		borrowed=true;
		return borrowed;
	}
	
	public boolean returned() {
		borrowed=false;
		return borrowed;
	}
	
	public String toString() {
		return "Book name is "+this.title+", Author is "+getAuthor();
	}

}