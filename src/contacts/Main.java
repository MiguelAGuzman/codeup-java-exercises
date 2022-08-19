package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static contacts.ContactsGateway.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean confirm = true;
        List<Contact> contacts;
        contacts = readContacts();
        if (contacts == null) {
            contacts = new ArrayList<>();
        }

        do {
            int selection = menuSelection();

            switch (selection) {
                case 1 -> printContactList(contacts);
                case 2 -> addNewContact(contacts);
                case 3 -> searchContacts(contacts);
                case 4 -> removeExistingContact(contacts);
                case 5 -> confirm = false;
            }
        } while (confirm);
        System.out.println("\nGoodbye, and have a nice day!");
        Files.write(filepath, ioOut(contacts).getBytes());
    }


}

