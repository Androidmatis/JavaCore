import java.util.ArrayList;

// Преобразование ArrayList в массив.
class ArrayListToArray {
    public static void main(String[] args) {
        // Создать списковый массив.
        ArrayList<Integer> al = new ArrayList<>();
        // Добавить элементы в списковый массив.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержание массива al: " + al);
        // Получить массив.
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);
        int sum = 0;
        // Просуммировать элементы массива.
        for (int i : ia)
            sum += i;
        System.out.println("Сумма элементов массива: " + sum);
    }
}
