// Использование встроенного функционального интерфейса Function.
// Импортировать интерфейс Function.
import java.util.function.Function;
class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычисляет факториал значения int.
        // Теперь функциональным интерфейсом Function.
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал 3 равен " + factorial.apply(3));
        System.out.println("Факториал 5 равен " + factorial.apply(5));
    }
}
