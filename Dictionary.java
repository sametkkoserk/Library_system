package packag;

public class Dictionary extends Book {
	
	private int definitions;
	
	public Dictionary(int id, String title, Author author, int definitions) {
		super(id, title, author);
		try {
			method1(definitions);  
			this.definitions = definitions;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		
		
		
	}
	public Dictionary(int id, String title, int definitions) {
		
		super(id, title);
		try {
			method1(definitions);  
			this.definitions = definitions;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		
	}
	void method1(int def) {
		if(def<0) {
			throw new IllegalArgumentException("Definition can not be less then zero");
		}
		
	}

	
	public int getDefinitions() {
		return definitions;
	}

	public void setDefinitions(int definitions) {
		this.definitions = definitions;
	}
	
	public String toString(){
		return "Dictionary name is " + getTitle() + ", definitions: " + this.definitions;
	}


}
