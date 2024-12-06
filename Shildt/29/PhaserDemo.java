// Пример использования Phaser.
import java.util.concurrent.*;
class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;
        System.out.println("Начало");
        new Thread(new MyThread(phsr, "A")).start();
        new Thread(new MyThread(phsr, "B")).start();
        new Thread(new MyThread(phsr, "C")).start();
        // Ожидать завершения всеми потоками первой стадии.
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Стадия " + curPhase + " завершена");
        // Ожидать завершения всеми потоками второй стадии.
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Стадия " + curPhase + " завершена");
        // Ожидать завершения всеми потоками третьей стадии.
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Стадия " + curPhase + " завершена");
        // Отменить регистрацию главного потока.
        phsr.arriveAndDeregister();
        if (phsr.isTerminated())
            System.out.println("Объект Phaser закончил работу.");
    }
}
// Поток выполнения, который использует объект Phaser.
class MyThread implements Runnable {
    Phaser phsr;
    String name;
    MyThread(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
    }
    public void run() {
        System.out.println("Поток " + name + " начал первую стадию");
        phsr.arriveAndAwaitAdvance();   // Сигнализировать о прибытии.
        // Организовать небольшую паузу, чтобы предотвратить беспорядочный
        // вывод. Это делается только в целях иллюстрации и не требуется
        // для корректной работы объекта Phaser.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Поток " + name + " начал вторую стадию");
        phsr.arriveAndAwaitAdvance();   // Сигнализировать о прибытии.
        // Организовать небольшую паузу, чтобы предотвратить беспорядочный
        // вывод. Это делается только в целях иллюстрации и не требуется
        // для корректной работы объекта Phaser.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Поток " + name + " начал третью стадию");
        phsr.arriveAndDeregister();     // Сигнализировать о прибытии
                                        // и отменить регистрацию
    }
}