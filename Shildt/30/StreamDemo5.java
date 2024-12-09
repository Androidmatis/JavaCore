// Использование метода map() для создания нового потока,
// который содержит избранные значения исходного потока.
import java.util.*;
import java.util.stream.*;
class NamePhoneEmail {
    String name;
    String phonenum;
    String email;
    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}
class NamePhone {
    String name;
    String phonenum;
    NamePhone(String n, String p) {
        name = n;
        phonenum = p;
    }
}
class StreamDemo5 {
    public static void main(String[] args) {
        // Список имен, телефонных номеров и адресов электронной почты.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@HerbSchildt.com"));
        System.out.println("Исходные значения в myList: ");
        myList.stream().forEach(a -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();
        // Сопоставить с новым потоком только имена и телефонные номера.
        Stream<NamePhone> nameAndPhone = myList.stream().map(
                a -> new NamePhone(a.name, a.phonenum)
        );
        System.out.println("Список имен и телефонных номеров: ");
        nameAndPhone.forEach(a -> {
            System.out.println(a.name + " " + a.phonenum);
        });
    }
}
