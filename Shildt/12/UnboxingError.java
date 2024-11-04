// Ошибка при ручной распаковке.
class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000;         // автоматически упаковать значение 1000
        int i = iOb.byteValue();    // вручную распоковать как byte!!!
        System.out.println(i);      // выводится не 1000!
    }
}
