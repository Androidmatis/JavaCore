// Демонстрация использования assert.
class AssertDemo {
    static int val = 3;
    // Возвращает целое число.
    static int getnum() {
        return val--;
    }
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();
            assert n > 0 : "n не является положительным!";   // потерпит неудачу, когда n равно 0
            System.out.println("n равно " + n);
        }
    }
}
