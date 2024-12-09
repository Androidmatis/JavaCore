// Сопоставление Stream с IntStream.
import java.util.*;
import java.util.stream.*;
class StreamDemo6 {
    public static void main(String[] args) {
        // Создать список значений типа double.
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);
        System.out.print("Исходные элементы myList: ");
        myList.stream().forEach(a -> {
            System.out.print(a + " ");
        });
        System.out.println();
        // Сопоставить ближайшие большие целые значения для элементов
        // в myList с IntStream.
        IntStream cStrm = myList.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.print("Ближайшие большие целые значения для элементов myList: ");
        cStrm.forEach(a -> {
            System.out.print(a + " ");
        });
    }
}
