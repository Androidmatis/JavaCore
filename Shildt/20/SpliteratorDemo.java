import java.util.ArrayList;
import java.util.Spliterator;

// Простая демонстрация использования Spliterator.
class SpliteratorDemo {
    public static void main(String[] args) {
        // Создать списковый массив для элементов типа double.
        ArrayList<Double> vals = new ArrayList<>();
        // Добавить значения в списковый массив.
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        // Использовать tryAdvance() для отображения содержимого vals.
        System.out.print("Содержимое vals:\n");
        Spliterator<Double> splitr = vals.spliterator();
        while (splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();
        // Создать новый список, содержащий значения квадратных
        // корней элементов из vals.
        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        // Использовать forEachRemaining() для отображения содержимого sqrs.
        System.out.print("Содержимое sqrs:\n");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
