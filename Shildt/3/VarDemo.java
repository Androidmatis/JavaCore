// Простая демонстрация выведения типовлокальных переменных.
class VarDemo {
    public static void main(String[] args) {
        // Использовать выведение типов для определения типов переменной
        // по имени avg. В этом случае выводится тип double.
        var avg = 10.0;
        System.out.println("Значение avg: " + avg);
        // В следущем контексте var - не предопределенный идентификатор,
        // а просто определяемое пользователем имя переменной.
        int var = 1;
        System.out.println("Значение var: " + var);
        // Интересно отметить, что в следущем фрагменте кода var используется
        // и как тип объявления, и как имя переменной в инициализаторе.
        var k = -var;
        System.out.println("Значение k: " + k);
    }
}
