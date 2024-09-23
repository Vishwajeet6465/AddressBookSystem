package addressBookSystem;


class Contact {
	
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String mob;
    private String mail;
    
	public Contact(String firstName, String lastName, String address, String city, String state, String zip,
			String mob, String mail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mob = mob;
		this.mail = mail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return mob;
	}

	public void setPhoneNumber(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return mail;
	}

	public void setEmail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Contact : \nfirstName = " + firstName + ", \nlastName = " + lastName + ", \naddress = " + address + ", \ncity = " + city
				+ ", \nstate = " + state + ", \nzip = " + zip + ", \nphoneNumber = " + mob + ", \nemail = " + mail;
	}
    
	
    
}
