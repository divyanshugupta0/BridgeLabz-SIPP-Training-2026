package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class Contact implements Comparable<Contact> {
    String name, phone, email;

    Contact(String n, String p, String e) {
        name = n;
        phone = p;
        email = e;
    }

    public int compareTo(Contact c) {
        return name.compareTo(c.name);
    }

    public String toString() {
        return name + " " + phone + " " + email;
    }
}

public class AddressBookApp {
    ArrayList<Contact> list = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phones = new HashSet<>();

    void add(Contact c) {
        if (phones.add(c.phone)) {
            list.add(c);
            map.put(c.name, c);
        }
    }

    void delete(String n) {
        Contact c = map.remove(n);
        if (c != null) {
            list.remove(c);
            phones.remove(c.phone);
        }
    }

    void search(String n) {
        System.out.println(map.get(n));
    }

    void display() {
        Collections.sort(list);
        for (Contact c : list) System.out.println(c);
    }

    public static void main(String[] a) {
        AddressBookApp b = new AddressBookApp();
        b.add(new Contact("A", "1", "a@g"));
        b.add(new Contact("B", "2", "b@g"));
        b.search("A");
        b.display();
    }
}