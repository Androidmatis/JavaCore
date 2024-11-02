// СОздание второго потока
class NewThread implements Runnable {
    Thread t;
    NewThread() {
        // Создать новый, втроой поток.
        t = new Thread(this, "DemoThread");
        System.out.println("Дочерний поток: " + t);
    }
    // Это точка входа для второго потока.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Завершение дочернего потока.");
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); // создать новый поток
        nt.t.start();                   // запустить поток
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Завершение главного потока.");
    }
}
