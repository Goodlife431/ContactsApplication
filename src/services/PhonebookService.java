package services;

import data.models.Contact;
import requests.ContactRequest;
import requests.PhonebookRequest;

public interface PhonebookService {
    void register(PhonebookRequest phoneBookRequest);

    void addContact(String ownerPhoneNumber, ContactRequest contactRequest);

    Contact findContact(String ownerPhoneNumber, String phoneNumberToFind);

    void deleteNumber(String ownerPhoneNumber, String phoneNumberToDelete);

    void updateContact(String ownerPhoneNumber, ContactRequest contactRequest);

    int countNumberOfUsers();
}
