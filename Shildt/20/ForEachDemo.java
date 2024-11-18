import java.util.ArrayList;

// Использование цикла for в стиле "for-each" для прохода по коллекции.
class ForEachDemo {
    public static void main(String[] args) {
        // Создать списковый массив для целых чисел.
        ArrayList<Integer> vals = new ArrayList<>();
        // Добавить значения в списковый массив.
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        // Использовать цик for для отображения значений.
        System.out.print("Содержимое vals: ");
        for (int v : vals)
            System.out.print(v + " ");
        System.out.println();
        // Просуммировать значения с применением цикла for.
        int sum = 0;
        for (int v : vals)
            sum += v;
        System.out.println("Сумма значений: " + sum);
    }
}
