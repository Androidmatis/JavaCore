// Демонстрация потоковых операций.
import java.util.*;
import java.util.stream.*;
class StreamDemo {
    public static void main(String[] args) {
        // Создать список значений типа Integer.
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Исходный список: " + myList);
        // Получить поток для ArrayList.
        Stream<Integer> myStream = myList.stream();
        // Получить минимальное и максимальное значения с использованием
        // методов min(), max(), isPresent() и get().
        Optional<Integer> minVal = myStream.min(Integer :: compare);
        if (minVal.isPresent()) System.out.println("Минимальное значение: " +
                minVal.get());
        // Требуется получить новый поток, поскольку предыдущий вызов min()
        // является заключительной операцией, которая потребляет поток.
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer :: compare);
        if (maxVal.isPresent()) System.out.println("Максимальное значение: " +
                maxVal.get());
        // Отсортировать поток с применением sorted().
        Stream<Integer> sortedStream = myList.stream().sorted();
        // Отобразить отсортированный поток с использованием forEach().
        System.out.print("Отсортированный поток: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        // Отобразить только нечетные значения с применением filter().
        Stream<Integer> oddVals =
                myList.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.print("Нечетные значения: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
        // Отобразить только нечетные значения, которые больше 5.
        // Обратите внимание,
        // что две операции фильтрации соединены в конвейер.
        oddVals = myList.stream().filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
        System.out.print("Нечетные значения, которые больше 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
