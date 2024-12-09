// Использование сплитератора.

import java.util.*;
import java.util.stream.*;

class StreamDemo9 {
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
        // Получить сплитератор потока.
        Spliterator<String> splitItr = myStream.spliterator();
        // Пройти по элементам в потоке.
        while (splitItr.tryAdvance(n -> System.out.println(n)));
    }
}
