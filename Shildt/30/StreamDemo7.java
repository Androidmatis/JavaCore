// Использование collect() для создания объектов List и Set из списка.

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
class StreamDemo7 {
    public static void main(String[] args) {
        // Список имен, телефонных номеров и адресов электронной почты.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@HerbSchildt.com"));
        // Сопоставить с новым потоком только имена и телефонные номера.
        Stream<NamePhone> nameAndPhone = myList.stream().map(
                a -> new NamePhone(a.name, a.phonenum)
        );
        // Использовать collect() для создания списка List
        // с именами и телефонными номерами.
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Имена и телефонные номера в List: ");
        for (NamePhone e : npList)
            System.out.println(e.name + ": " + e.phonenum);
        // Получить еще одно сопоставление имен и телефонных номеров.
        nameAndPhone = myList.stream().map(
                a -> new NamePhone(a.name, a.phonenum)
        );
        // Создать набор Set с применением collect().
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nИмена и телефонные номера в Set: ");
        for (NamePhone e : npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}
