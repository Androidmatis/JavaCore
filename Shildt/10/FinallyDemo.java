// Демонстрация применения finally.
class FinallyDemo {
    // Сгенерировать исключение внутри метода.
    static void procA() {
        try {
            System.out.println("Внутри метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок finally мутода procA()");
        }
    }
    // Возвратить управление изнутри блока try.
    static void procB() {
        try {
            System.out.println("Внутри метода procB()");
            return;
        } finally {
            System.out.println("Блок finally мутода procB()");
        }
    }
    // Выполнить блок try обычным образом.
    static void procC() {
        try {
            System.out.println("Внутри метода procC()");
        } finally {
            System.out.println("Блок finally мутода procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
