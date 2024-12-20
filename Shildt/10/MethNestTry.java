/* Операторы try могут быть неявно вложенными через вызовы методов. */
class MethNestTry {
    static void nesttry(int a) {
        try {   // вложенный блок try
            /* Если используется один аргумент командной строки, тогда
                исключение деления на ноль сгенерирует следующий код. */
            if (a == 1) a = a / (a - a);    // деление на ноль
                /* Если используется два аргумета командной строки,
                    тогда генерируется исключение выхода за допустимые
                    пределы индекса в массиве.  */
            if (a == 2) {
                int[] c = {1};
                c[42] = 99; // генерирует исключение ArrayIndexOutOfBoundsException
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за допустимые пределы индекса в массиве: " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            /* Если аргументы командной строки отсутсвуют, то следующий
                оператор сгенерирует исключение деления на ноль.    */
            int b = 42 / a;
            System.out.println("a = " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }
    }
}
