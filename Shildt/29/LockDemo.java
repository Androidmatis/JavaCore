// Простой пример использования блокировки.
import java.util.concurrent.locks.*;
class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new LockThread(lock, "A")).start();
        new Thread(new LockThread(lock, "B")).start();
    }
}
// Общий ресурс.
class Shared {
    static int count = 0;
}
// Поток, поток который икрементирует count.
class LockThread implements Runnable {
    String name;
    ReentrantLock lock;
    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
    }
    public void run() {
        System.out.println("Начало " + name);
        try {
            // Заблокировать count.
            System.out.println(name + " ожидает блокировку count.");
            lock.lock();
            System.out.println(name + " блокирует count.");
            Shared.count++;
            System.out.println(name + ":" + Shared.count);
            // Разрешить переключение контекста, если это возможно.
            System.out.println(name + " в состоянии ожидания.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            // Снять блокировку.
            System.out.println(name + " снимает блокировку count.");
            lock.unlock();
        }
    }
}