import java.util.Scanner;

public class PhoneBook extends PhoneBookEntry {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Phonebook Manager");
		
		// create an array
		PhoneBookEntry[] book = new PhoneBookEntry[5];
		
		//fill empty array
				for(int i = 0; i<book.length; i++) {
					book[i]= new PhoneBookEntry();
				}
				
		int i = 0;
		boolean flagval = false;
		
		while(!flagval) {
			
			Menu();
			int choice = input.nextInt();
			
			//add entry
			if (choice == 1) {
				if(i < 5) {
					System.out.print("Please enter the ID of the individual: ");
					int Id = input.nextInt();
					System.out.print("Please enter the first name of the individual: ");
					String firstname = input.next();
					System.out.print("Please enter the last name of the individual: ");
					String lastname = input.next();
					System.out.print("Please enter the email of the individual: ");
					String email = input.next();
					System.out.print("Please enter the zip code of the individual: ");
					int zipcode = input.nextInt();
					System.out.print("Please enter the phone number of the individual: ");
					long phonenumber = input.nextLong();
					book[i] = new PhoneBookEntry(Id,firstname, lastname, email, zipcode, phonenumber);
					i+=1;			
				}else {
					System.out.print("Sorry! Phone Book Manager has reached capacity. ");
				}
				
			//Edit an entry
			}else if (choice == 2) {
				System.out.println("Enter the ID of the individual you would like to edit the information of: ");
				int entry = input.nextInt();
				
				//loop through array until desired entry is found
				for(int g = 0; g < book.length; g++) {
					if(book[g].getId() == entry) {
						book[g] = new PhoneBookEntry();
						System.out.println("Please enter the desired ID: ");
						book[g].setId(input.nextInt());
						System.out.println("Please enter the desired first name: ");
						book[g].setFirstname(input.next());
						System.out.println("Please enter the desired last name: ");
						book[g].setLastname(input.next());
						System.out.println("Please enter the desired email: ");
						book[g].setEmail(input.next());
						System.out.println("Please enter the desired zip code: ");
						book[g].setZipcode(input.nextInt());
						System.out.println("Please enter the desired phone number: ");
						book[g].setPhonenumber(input.nextLong());
					}
				}

			//Print entry of a user	
			}else if (choice == 3) {
				System.out.println("Enter the ID of the individual you would like to print the information of: ");
				int entry = input.nextInt();
				
				for(int printloop = 0; printloop < book.length; printloop++){
					if(book[printloop].getId() == entry){
						book[printloop].PrintBookEntry();
					}
				}
			
			//edit zipcode
			}else if (choice == 4) {
				System.out.println("Enter the ID of the individual you would like to edit the zip code of: ");
				int entry = input.nextInt();
				
				//use getId to get ID
				for(int gg = 0; gg < book.length; gg++) {
					if(book[gg].getId() == entry){
						System.out.println("Enter the ID of the individual you would like replace zip code with: ");
						int entrytwo = input.nextInt();
						for(int zip = 0; zip < book.length; zip++) {
							if(book[zip].getId() == entrytwo) {
								book[gg] = new PhoneBookEntry();
								book[gg].setZipcode(book[zip].getZipcode());
							}
						}
					}
				}
				
			//exit manager
			}else if (choice == 5) {
				System.out.println("Goodbye");
				flagval = true;
				break;
			}
		}
	}
		
	//display menu
	public static void Menu() {
		
		System.out.println("1. Add an Entry");
		System.out.println("2. Edit an Entry");
		System.out.println("3. Display the Information of a Entry");
		System.out.println("4. Assign Zip Code");
		System.out.println("5. Exit");
				
		System.out.println("Enter Selection: ");
	}

}
