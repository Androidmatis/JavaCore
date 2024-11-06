class MyCalss {
    int a;
    int b;
    // Инициализировать a и b по отдельности.
    MyCalss(int i, int j) {
        a = i;
        b = j;
    }
    // Инициализировать a и b одним и тем же значением.
    MyCalss(int i) {
        this(i, i);     // вызывается MyClass(i, i)
    }
    // Предоставить a и b стандартные значения 0;
    MyCalss() {
        this(0);    // вызывается MyClass(0)
    }
}
