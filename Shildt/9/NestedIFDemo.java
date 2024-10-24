// Пример вложенного интерфейса.
// Класс A содержит член-интерфейс.
class A {
    // Вложенный интерфейс.
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// Класс B реализует вложенный интерфейс.
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        // Использовать ссылку на вложенный интерфейс.
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("10 не является отрицательным");
        if (nif.isNotNegative(-12))
            System.out.println("Это выводиться не будет");
    }
}
