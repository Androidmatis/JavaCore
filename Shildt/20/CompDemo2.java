import java.util.*;

// Использование лямбда-выражения для реализации Comparator<String>.
class CompDemo2 {
    public static void main(String[] args) {
        // Передать обратный компаратор конструктору TreeSet()
        // через лямбда-выражение
        TreeSet<String> ts = new TreeSet<>(
                (aStr, bStr) -> bStr.compareTo(aStr));
        // Добавить элементы в древовидный набор.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // Отображать элементы.
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
