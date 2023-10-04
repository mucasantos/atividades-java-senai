package entities;

/*
 * author: Samuel Santos
 * */
public class Rent {
	private String name;
	private String email;
	private String rg;
	
	//Construtor vazio
	Rent(){}

	public Rent(String name, String email, String rg) {
		this.name = name;
		this.email = email;
		this.rg = rg;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}
	
	
	
}
