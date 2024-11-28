import java.util.Timer;
import java.util.TimerTask;

// Демонстрация использования классов Timer и TimerTask.
class MyTimerTask extends TimerTask {
    public void run() {
        System.out.println("Выполнение задач таймера.");
    }
}
class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        /* Установить начальную задержку в одну секунду
            и затем повторять каждые полсекунды.
         */
        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {}
        myTimer.cancel();
    }
}
