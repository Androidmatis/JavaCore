import java.util.HashSet;

// Демонстрация работы HashSet.
class HashSetDemo {
    public static void main(String[] args) {
        // Создать хэш-таблицу.
        HashSet<String> hs = new HashSet<>();
        // Добавить элементы в хэш-таблицу.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        System.out.println(hs);
    }
}
