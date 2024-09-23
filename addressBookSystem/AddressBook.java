package addressBookSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	
	private List<Contact> contacts = new ArrayList<>();
	
	private static AddressBook addressBook = new AddressBook();
	
	static Scanner sc = new Scanner(System.in);
	
	public void addContacts(Contact contact) {
		contacts.add(contact);
	}
	
	private static void addNewContact() {
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
            System.out.println("3. Exit");
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
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}

}
