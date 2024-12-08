// Простая программа, которая позволяет экспериментировать с эффектами
// от изменения порогового значения и уровня параллелизма задач ForkJoinTask.
import java.util.concurrent.*;
// Задача ForkJoinTask, которая (через RecursiveAction)
// трансформирует элементы массива значений double.
class Transform extends RecursiveAction {
    // Порог последовательной обработки, который устанавливается конструктором
    int seqThreshold;
    // Массив, в который будет осуществляться доступ.
    double[] data;
    // Определить, какую часть данных обрабатывать.
    int start, end;
    Transform(double[] vals, int s, int e, int t) {
        data = vals;
        start = s;
        end = e;
        seqThreshold = t;
    }
    // Метод, в котором будут происходить параллельные вычисления.
    protected void compute() {
        // Если количество элементов меньше порогового значения,
        // тогда обрабатывать последовательно.
        if ((end - start) < seqThreshold) {
            // В следующем коде элементу с четным индексом присваивается
            // квадратный корень из его исходного значения. Элементу с нечетным
            // индексом присваивается кубический корень его исходного значения.
            // Этот код предназначен для простого потребления процессорного
            // времени, чтобы эффекты параллельного выполнения стали более заметными.
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]);
                else
                    data[i] = Math.cbrt(data[i]);
            }
        }
        else {
            // В противном случае продолжить разделение данных на меньшие части.
            // Найти среднюю точку.
            int middle = (start + end) / 2;
            // Запустить новые задачи, используя дополнительно разделенные
            // на части данные.
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }

    }
}
// Демонстрация параллельного выполнения.
class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;
        if (args.length != 2) {
            System.out.println("Использование: FJExperiment " +
                    "уровень-параллелизма пороговое-значение");
            return;
        }
        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);
        // Переменные, используемые для измерения времени выполнения задачи.
        long beginT, endT;
        // Создать пул задач. Обратите внимание на установку уровня параллелизма.
        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] nums = new double[1000000];
        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) i;
        Transform task = new Transform(nums, 0, nums.length, threshold);
        // Начать измерение времени.
        beginT = System.nanoTime();
        // Запустить главную задачу ForkJoinTask.
        //fjp.invoke(task);
        // Запустить главную задачу ForkJoinTask асинхронным образом.
        fjp.execute(task);
        // Отобразить состояние пула во время выполнения.
        while (!task.isDone())
            System.out.println(fjp);
        // Закончить измерение времени.
        endT = System.nanoTime();
        System.out.println("Уровень параллелизма: " + pLevel);
        System.out.println("Порог последовательной обработки: " + threshold);
        System.out.println("Общее затраченное время: " + (endT - beginT) + " нс");
        System.out.println();

    }
}
