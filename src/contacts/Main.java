package contacts;


import util.Input;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();

        ContactsList contact = new ContactsList();

        Contact bob = new Contact("bob", "210-555-5556");
        Contact mark = new Contact("mark", "210-555-5555");
        System.out.println(Contact.createFromString("bob"));
        contact.addContact(bob);
        contact.addContact(mark);
        contact.printContacts();
        contact.removeContact("mark");
        contact.printContacts();
        System.out.println(contact.getIndexByContactName("mark"));
        System.out.println(contact.getContactByName("bob"));
    }

    private static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                1. View contacts.
                2. Add a new contact.
                3. Search a contact by name.
                4. Delete an existing contact.
                5. Exit.
                Enter an option (1, 2, 3, 4 or 5):
                            
                """);
    }


}