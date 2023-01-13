package data.repository;

import data.models.Phonebook;

import java.util.List;

public interface PhonebookRepository {
    Phonebook save(Phonebook phonebook);
    void delete(Phonebook phonebook);
    int count();
    List<Phonebook> getPhoneBook();
    Phonebook findById(String phoneNumber);
}
