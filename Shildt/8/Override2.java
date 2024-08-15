// Методы с отличающимися сигнатурами типов
// являеются перегруженными - не переопределенными.
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
    // Перегрузить show().
    void show(String msg) {
        System.out.println(msg + k);
    }
}
class Override2 {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show("Это k: ");   // Вызывает show() из B
        subOb.show();   // Вызывает show() из A
    }
}
