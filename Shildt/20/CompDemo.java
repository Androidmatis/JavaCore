import java.util.*;

// Использование специального компаратора.
// Обратный компаратор для строк.
class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        // Обратить внимание.
        return bStr.compareTo(aStr);
    }
    // Переопределять equals() и методы со стандартной реализацией не требуется.
}
class CompDemo {
    public static void main(String[] args) {
        // Создать древовидный набор.
        TreeSet<String> ts = new TreeSet<>(new MyComp());
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
