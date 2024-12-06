// Пример расширения класса Phaser и переопределение метода onAdvance(),
// чтобы выполнялось только заданное количество стадий.

import java.util.concurrent.*;
// Расширить класс MyPgaser, чтобы разрешить выполнение
// только указанного количества стадий.
class MyPhaser extends Phaser {
    int numPhases;
    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }
    // Переопределить метод onAdvance() для выполнения указанного
    // количества стадий.
    protected boolean onAdvance(int p, int regParties) {
        // Этот оператор pritln() предназначен только для иллюстрационных целей
        // обычно метод onAdvance() ничего не отображает.
        System.out.println("Стадия " + p + " завершена.\n");
        // Если все стадии завершены, тогда возвратить true.
        if (p == numPhases || regParties == 0) return true;
        // В противном случае вернуть  false.
        return false;
    }
}
class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);
        System.out.println("Начало\n");
        new Thread(new MyThread(phsr, "A")).start();
        new Thread(new MyThread(phsr, "B")).start();
        new Thread(new MyThread(phsr, "C")).start();
        // Ожидать завершения указанного количества стадий.
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
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
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает стадию " +
                    phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            // Организовать небольшую паузу, чтобы предотвратить беспорядочный
            // вывод. Это делается только в целях иллюстрации и не требуется
            // для корректной работы объекта Phaser.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}