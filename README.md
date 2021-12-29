# phonebook-project
Christina Borao - Phone Book Entry System

The Phone Book Entry Application utilizes object oriented programming to create a phone book.

The main PhoneBook class inherits the PhoneBookEntry class. The PhoneBookEntry class possesses protected variables, constructors, and getters & setters.

Upon being run, the program will display a menu and prompt the user to enter their selection. The user will continue to enter selections until their input matches the "Exit" option. 

The user will be able to:
1. Add a phone book entry
2. Edit a phone book entry
3. Display the information of an Entry
4. Assign Zip Code
5. Exit

Selection one will add an entry. Each phone book entry will house an entry id, first name, last name, email, zip code, and phone number. The user will be prompted to input all the information into an array.

Selection two will edit an entry. The user will be asked the id of the desired entry. If the id inputted matches an entry within the phone book, the user will be prompted to edit the desired entry.

Selection three will print an entry. The user will be asked to enter the id of an entry. If the id matches an entry within the phone book the desired entry will be printed.

Selection four will replace the zip code of one entry with the zip code of another. The user will be asked to enter the id of two entries. If both ids match ids within the phone book, the zip code replacement will occur.

Selection five will exit the phone book manager.
