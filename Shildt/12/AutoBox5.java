// Автоупаковка/автораспаковка объектов Boolean и Character.
class AutoBox5 {
    public static void main(String[] args) {
        // Автоматически упаковать/распаковать значение boolean.
        Boolean b = true;
        // Ниже b автоматически распаковывается при использовании
        // в условном выражении, таком как if.
        if (b) System.out.println("b равно true");
        // Автоматически упаковать/распаковать значение char.
        Character ch = 'x'; // упаковать char
        char ch2 = ch;      // распаковать char
        System.out.println("ch2 равно " + ch2);
    }
}
