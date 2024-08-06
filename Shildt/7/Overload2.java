// Демонстрация перегрузки методов.
class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют.");
    }
    // Перегрузить test() для двух целочисленных параметров.
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    // Перегрузить test() для одного параметра типа double.
    void test(double a) {
        System.out.println("Внутри test(double) a: " + a);
    }
}
class Overload2 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);
    }
}