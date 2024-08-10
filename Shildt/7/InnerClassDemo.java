// Демонстрация работы с внутренним классом.
class Outer {
    int outer_x = 100;
    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                int y = 10; // Для теста ошибки!

                void display() {
                    System.out.println("display() : outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
    /*
    void showy() {
        System.out.println(y);  // ошибка, переменная y здесь неизвестна
    }
    */
}
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}