package exercise2_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
       phoneBook = new HashMap<>();
    }

    public void addPerson(Student s) {
        phoneBook.put(s.phone, s);
    }

    public Student searchByName(String name) {
        Set<String> set = phoneBook.keySet();
        for (String key : set) {
            if (phoneBook.get(key).name.equals(name)) {
                return phoneBook.get(key);
            }
        }
        return null;
    }

    public Student searchByLastName(String lastname) {
        Set<String> set = phoneBook.keySet();
        for (String key : set) {
            if (phoneBook.get(key).lastname.equals(lastname)) {
                return phoneBook.get(key);
            }
        }
        return null;
    }

    public Student searchByNumber(String phone) {
        Set<String> set = phoneBook.keySet();
        for (String key : set) {
            if (phoneBook.get(key).phone.equals(phone)) {
                return phoneBook.get(key);
            }
        }
        return null;
    }

    public void deleteByNumber(String phone) {
        Set<String> set = phoneBook.keySet();
        for (String key : set) {
            if (phoneBook.get(key).phone.equals(phone)) {
                phoneBook.remove(key);
            }
        }
    }
}
