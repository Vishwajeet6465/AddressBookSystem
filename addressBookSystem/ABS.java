package addressBookSystem;

import java.util.*;

public class ABS {
	
	private Map<String, AddressBook> addressBooks;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ABS system = new ABS();
		system.run();
	}
	
	public ABS() {
		addressBooks = new HashMap<>();
	}
	
	public void run() {
		while(true) {
			System.out.println("1. Add New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1:
                addNewAddressBook();
                break;
            case 2:
                selectAddressBook();
                break;
            case 3:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                }
		}
	}

	private void selectAddressBook() {
		// TODO Auto-generated method stub
		System.out.print("Enter the name of the Address Book to select: ");
        String name = sc.nextLine();
        AddressBook addressBook = addressBooks.get(name);

        if (addressBook != null) {
            manageContacts(addressBook);
        } else {
            System.out.println("Address Book not found.");
        }
	}

	private void manageContacts(AddressBook addrsBook) {
		// TODO Auto-generated method stub
		while (true) {
            System.out.println("1. Add New Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addNewContact(addrsBook);
                    break;
                case 2:
                    addrsBook.printContacts();
                    break;
                case 3:
                    editContact(addrsBook);
                    break;
                case 4:
                    deleteContact(addrsBook);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
		}
	}


	private void deleteContact(AddressBook addrsBook) {
		// TODO Auto-generated method stub
		System.out.print("Enter First Name of the contact to delete: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name of the contact to delete: ");
        String lastName = sc.nextLine();

        if (!addrsBook.deleteContact(firstName, lastName)) {
            System.out.println("Contact not found. Please check the name and try again.");
        }
	}

	private void editContact(AddressBook addrsBook) {
		// TODO Auto-generated method stub
		System.out.print("Enter First Name of the contact to edit: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name of the contact to edit: ");
        String lastName = sc.nextLine();

        if (!addrsBook.editContact(firstName, lastName)) {
            System.out.println("Contact not found.");
        }
	}

	private void addNewContact(AddressBook addrsBook) {
		// TODO Auto-generated method stub
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
        String phoneNumber = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addrsBook.addContacts(contact);
        System.out.println("Contact added successfully.");
	}

	private void addNewAddressBook() {
		// TODO Auto-generated method stub
		System.out.print("Enter the name for the new Address Book: ");
        String name = sc.nextLine();
        if (addressBooks.containsKey(name)) {
            System.out.println("An Address Book with this name already exists.");
        } else {
            addressBooks.put(name, new AddressBook());
            System.out.println("Address Book '" + name + "' added successfully.");
        }
	}
}
