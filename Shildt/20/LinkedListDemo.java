import java.util.LinkedList;

// Демонстрация использования LinkedList.
class LinkedListDemo {
    public static void main(String[] args) {
        // Создать связный список.
        LinkedList<String> ll = new LinkedList<>();
        // Добавить элементы в связный список.
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Исходное содержимое ll: " + ll);
        // Удалить элементы из связного списка.
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое ll после удаления: " + ll);
        // Удалить первый и последний элементы.
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Содержимое ll после удаления первого и последнего " +
                "элементов: " + ll);
        // Получить и установить значение.
        String val = ll.get(2);
        ll.set(2, val + " изменено");
        System.out.println("Содержимое ll после изменения: " + ll);
    }
}
