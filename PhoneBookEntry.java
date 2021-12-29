public class PhoneBookEntry { //class with getters & setters, constructors, and variables
	
	// protected variables
	protected int Id = -1;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected int zipcode;
	protected long phonenumber;
	
	//constructors
	public PhoneBookEntry(int z, String a, String b, String c, int y, long x) {
		
		this.Id = z;
		this.firstname = a;
		this.lastname = b;
		this.email = c;
		this.zipcode = y;
		this.phonenumber = x;
		
	}
	
	public PhoneBookEntry(String a,long x) {
		
		this.firstname = a;
		this.phonenumber = x;
	}
	
	public PhoneBookEntry() {
		
	}
	
	//getters and setters

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void PrintBookEntry() { //prints info
			
			System.out.println("----------------------------------");
			System.out.println("Info about this entry:");
			System.out.println("Id: "+ this.getId());
			System.out.println("First name: "+ this.getFirstname());
			System.out.println("Last name: "+ this.getLastname());
			System.out.println("Email: "+ this.getEmail());
			System.out.println("Zip Code: "+ this.getZipcode());
			System.out.println("Phone Number: "+ this.getPhonenumber());
			System.out.println("----------------------------------");
	}	

} //end of class