package data.repository;

import data.models.Phonebook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookRepositoryImpTest {
    private  PhonebookRepository phoneBookRepository;
    Phonebook phoneBook;
    @BeforeEach
    public void setUp(){
        phoneBookRepository = new PhonebookRepositoryImp();
        phoneBook = new Phonebook();
    }
    @Test
    public  void  savePhoneBookTotalPhoneBookIsOneTest(){
        //       given i have a new phonebook repository
        //       when i try to save a contact
        //       assert equals count is 1

        Phonebook amirah = new Phonebook();
        phoneBookRepository.save(amirah);
        assertEquals(1, phoneBookRepository.count());
    }
    @Test
    public void savePhoneBookFindByIdReturnSavedPhoneBook(){
//        given that i have phonebook repository
//                when i save a new phonebook
//                and when i find by id
//                assert that phonebook is equals
        phoneBook.setOwnerPhoneNumber("9999");
        phoneBook.setOwnerName("seun");
        phoneBookRepository.save(phoneBook);
        Phonebook savedPhoneBook = phoneBookRepository.findById("9999");
        assertEquals(phoneBook, savedPhoneBook);
        assertEquals("seun", savedPhoneBook.getOwnerName());
    }
    @Test
    public void updatePhoneBookFindByIdReturnUpdatedPhoneBook(){
//        given that i have phonebook repository
//                when i save a new phonebook
//                and when i update
//                assert that phonebook details has been updated
        Phonebook amirah = new Phonebook();
        amirah.setOwnerPhoneNumber("9999");
        amirah.setOwnerName("seun");
        phoneBookRepository.save(amirah);

        Phonebook updatedPhonebook = new Phonebook();
        updatedPhonebook.setOwnerPhoneNumber("9999");
        updatedPhonebook.setOwnerName("simi");
        phoneBookRepository.save(updatedPhonebook);
        Phonebook savedPhonebook = phoneBookRepository.findById("9999");
        assertEquals(1, phoneBookRepository.count());
        assertEquals("simi",savedPhonebook.getOwnerName());
    }
}