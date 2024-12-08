// Простой пример использования атомарной операции.
import java.util.concurrent.atomic.*;
class AtomicDemo {
    public static void main(String[] args) {
        new Thread(new AtomThread("A")).start();
        new Thread(new AtomThread("B")).start();
        new Thread(new AtomThread("C")).start();
    }
}
class Shared {
    static AtomicInteger ai = new AtomicInteger(0);
}
// Поток выполнения, который инкрементирует счетчик
class AtomThread implements Runnable {
    String name;
    AtomThread(String n) {
        name = n;
    }
    public void run() {
        System.out.println("Начало " + name);
        for (int i = 0; i <= 3; i++)
            System.out.println(name + " получено: " + Shared.ai.getAndSet(i));
    }
}
