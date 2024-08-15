// Переопределение методов.
class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }
    // Отображение значения i и j.
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // Отобразить k - переопределяет show() в A.
    void show() {
        super.show();   // вызывается show() из A
        System.out.println("k: " + k);
    }
}
class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show();   // Вызывает show() из B
    }
}
