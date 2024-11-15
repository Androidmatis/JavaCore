import java.util.TreeSet;

// Демонстрация использования TreeSet.
class TreeSetDemo {
    public static void main(String[] args) {
        // Создать древовидный набор.
        TreeSet<String> ts = new TreeSet<>();
        // Добавить элементы в древовидный набор.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}
