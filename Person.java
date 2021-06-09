package packag;

public class Person {
	
	private String name="-";
	private String birthDate="-";
	private String birthPlace="-";
	
	public Person(String name, String birthDate, String birthPlace) {
		try {
			method1(name);  
			this.name = name;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		try {
			method2(birthDate);  
			this.birthDate = birthDate;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		try {
			method3(birthPlace);  
			this.birthPlace = birthPlace;
		}
		catch (Exception ex) {
			System.out.println(ex);  
		}

		
	}

	
	public Person(String name, String birthDate) {
		try {
			method1(name);  
			this.name = name;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}
		try {
			method2(birthDate);  
			this.birthDate = birthDate;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}

		this.name = name;
		this.birthDate = birthDate;
		
	}
	
	public Person(String name) {
		try {
			method1(name);  
			this.name = name;
		}  
		catch (Exception ex) {
			System.out.println(ex);  
		}

		this.name = name;
		
	}
	void method1(String name) {
		if(name.length()<3) {
			throw new IllegalArgumentException("Name can not be shorter then three symbols");
		}
		
	}
	void method2(String date) {
		if((Integer.parseInt(date))<0) {
			throw new IllegalArgumentException("Birthdate can not be less then zero");
		}
		
	}
	void method3(String place) {
		if(place.length()<3) {
			throw new IllegalArgumentException("Birthplace can not be shorter then three symbols");
		}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	public String toString() {
		return this.name+", Birth Date: "+this.birthDate+", Birth Place: "+this.birthPlace;
		
	}

	

}