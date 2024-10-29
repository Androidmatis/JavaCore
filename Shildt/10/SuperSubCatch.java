/* Эта программа содержит ошибку.
    В последовательности конструкций catch подкласс должен
    предшествовать своему суперклассу. В противном случае будет создан
    недостижимый код, что приведет к ошибке на этапе компиляции.
 */
class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват обобщенного исключения Exception.");
        }
        /* Это конструкция catch недостижима, потому что
            ArithmeticException является подклассом Exception.*/
        catch (ArithmeticException e) { // ОШИБКА - недостижимый код
            System.out.println("Это никогда не будет достигнуто.");
        }
    }
}
