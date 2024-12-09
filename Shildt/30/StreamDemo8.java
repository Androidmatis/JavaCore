// Использование итератора с потоком.

import java.util.*;
import java.util.stream.*;

class StreamDemo8 {
    public static void main(String[] args) {
        // Создать список строк.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");
        // Получить поток для ArrayList.
        Stream<String> myStream = myList.stream();
        // Получить итератор потока.
        Iterator<String> itr = myStream.iterator();
        // Пройти по элементам в потоке.
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
