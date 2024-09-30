package addressBookSystem;

import java.util.*;

public class AddressBook {
	
	private List<Contact> contacts;
	
	public AddressBook() {
		contacts = new ArrayList<>();
	}
	
	public void addContacts(Contact contact) {
		contacts.add(contact);
	}
	
		
	public boolean editContact(String firstName, String lastName) {
	     Optional<Contact> contactOpt = contacts.stream()
	    		 .filter(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName))
	             .findFirst();

	     if (contactOpt.isPresent()) { //isPresent() is an object return true if value is present 
	    	 Contact contact = contactOpt.get();
	    	 Scanner sc = new Scanner(System.in);

	         System.out.println("Editing contact: " + contact);
	         System.out.print("Enter new Address: ");
	         contact.setAddress(sc.nextLine());
	         System.out.print("Enter new City: ");
	         contact.setCity(sc.nextLine());
	         System.out.print("Enter new State: ");
	         contact.setState(sc.nextLine());
	         System.out.print("Enter new Zip: ");
	         contact.setZip(sc.nextLine());
	         System.out.print("Enter new Phone Number: ");
	         contact.setPhoneNumber(sc.nextLine());
	         System.out.print("Enter new Email: ");
	         contact.setEmail(sc.nextLine());

	         System.out.println("Contact updated successfully.");
	         return true;
	     } else {
	         System.out.println("Contact not found.");
	         return false;
	     }
	 }
	 
	
	
	public boolean deleteContact(String firstName, String lastName) {
		 Iterator<Contact> iterator = contacts.iterator();
	     while (iterator.hasNext()) {
	        Contact contact = iterator.next();
	        if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
	            iterator.remove();
	        System.out.println("Contact deleted successfully.");
	        return true;
	        }
	     }
	     System.out.println("Contact not found.");
	     return false;
	 }
	 
	 
	
	public void printContacts() {
		
		if(contacts.isEmpty()) {
			System.out.println("No contacts available.");
			return;
		}
		System.out.println("---------------------");
		for(Contact contact: contacts) {
			System.out.println(contact);
		}
		System.out.println("---------------------");
	}
	
	
	

}
