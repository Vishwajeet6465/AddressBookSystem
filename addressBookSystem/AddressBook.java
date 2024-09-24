package addressBookSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AddressBook {
	
	private List<Contact> contacts = new ArrayList<>();
	
	private static AddressBook addressBook = new AddressBook();
	
	static Scanner sc = new Scanner(System.in);
	
	public void addContacts(Contact contact) {
		contacts.add(contact);
	}
	
	private static void addNewContact() {
		
		while(true) {
			 System.out.print("Enter First Name: ");
		     String firstName = sc.nextLine();
		     System.out.print("Enter Last Name: ");
		     String lastName = sc.nextLine();
		     System.out.print("Enter Address: ");
		     String address = sc.nextLine();
		     System.out.print("Enter City: ");
		     String city = sc.nextLine();
		     System.out.print("Enter State: ");
		     String state = sc.nextLine();
		     System.out.print("Enter Zip: ");
		     String zip = sc.nextLine();
		     System.out.print("Enter Phone Number: ");
		     String phone = sc.nextLine();
		     System.out.print("Enter Email: ");
		     String email = sc.nextLine();
	
		     Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
		     addressBook.addContacts(contact);
		     System.out.println("Contact added successfully.");
		     
		     System.out.print("Do you want to add another contact? (yes/no): ");
	         String response = sc.nextLine();
	         if (!response.equalsIgnoreCase("yes")) {
	             break;
	         }
         
		}

	}
	
	public boolean editContact(String firstName, String lastName) {
	     Optional<Contact> contactOpt = contacts.stream()
	    		 .filter(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName))
	             .findFirst();

	     if (contactOpt.isPresent()) {
	    	 Contact contact = contactOpt.get();

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
	 
	private static void editContact() {
	        System.out.print("Enter First Name of the contact to edit: ");
	        String firstName = sc.nextLine();
	        System.out.print("Enter Last Name of the contact to edit: ");
	        String lastName = sc.nextLine();

	        addressBook.editContact(firstName, lastName);
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
	 
	 private static void deleteContact() {
	        System.out.print("Enter First Name of the contact to delete: ");
	        String firstName = sc.nextLine();
	        System.out.print("Enter Last Name of the contact to delete: ");
	        String lastName = sc.nextLine();

	        addressBook.deleteContact(firstName, lastName);
	    } 
	
	public void printContacts() {
		System.out.println("---------------------");
		for(Contact contact: contacts) {
			System.out.println(contact);
		}
		System.out.println("---------------------");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System Program");		
		
		while (true) {
			System.out.println("1. Add New Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    addressBook.printContacts();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exited Succesfully..");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}

}
