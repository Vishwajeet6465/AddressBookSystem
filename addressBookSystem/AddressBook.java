package addressBookSystem;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private List<Contact> contacts = new ArrayList<>();
	
	public void addContacts(Contact contact) {
		contacts.add(contact);
	}
	
	public void printContacts() {
		for(Contact contact: contacts) {
			System.out.println(contact);
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System Program");		
		
		AddressBook addressBook = new AddressBook();
		
		//Enter details with following flow ==> FirstName, LastName, Address,city, state, pin, mob, mail
		Contact contact = new Contact("Vishwajeet","Bamane","Talegaon Dabhade","Pune","Maharastra","410507","9999999999","vb@email.com");
		addressBook.addContacts(contact);
		addressBook.printContacts();
	}

}
