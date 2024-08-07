/*  В этой программе демонстрируется
    отличие между public и private.
 */
class Test {
    int a;              // стандартный доступ
    public int b;       // открытый доступ
    private int c;      // закрытый доступ
    // методы для доступа к c
    void setc(int i) {  // установить значение c
        c = i;
    }
    int getc() {        // получить значение c
        return c;
    }
}
class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        // Поступать так законно, т.к. членам a и b разрешен прямой доступ.
        ob.a = 10;
        ob.b = 20;
        // Поступать так нельзя, т.к. возникнет ошибка.
        // ob.c = 100;  // Ошибка!
        // Получать доступ к члену необходимо через его методы.
        ob.setc(100);   // Нормально
        System.out.println("a, b и c: " + ob.a + " " +
                            ob.b + " " + ob.getc());
    }
}