// Простой пример использования RecursiveTask<V>.
import java.util.concurrent.*;
// Задача RecursiveTask, которая вычисляет сумму значений
// в массиве типа double.
class Sum extends RecursiveTask<Double> {
    // Порог последовательной обработки.
    final int seqThreshold = 500;
    // Массив, в который будет осуществляться доступ.
    double[] data;
    // Определить, какую часть данных обрабатывать.
    int start, end;
    Sum(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }
    // Найти сумму значений в массиве double.
    protected Double compute() {
        double sum = 0;
        // Если количество элементов меньше порогового значения,
        // тогда обрабатывать последовательно.
        if ((end - start) < seqThreshold) {
            // Суммировать элементы.
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        }
        else {
            // В противном случае продолжить разделение данных на меньшие части.
            // Найти среднюю точку.
            int middle = (start + end) / 2;
            // Запустить новые задачи, используя дополнительно разделенные
            // на части данные.
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);
            // Запустить все задачи с помощью fork().
            subTaskA.fork();
            subTaskB.fork();
            // Ожидать, пока подзадачи возвратят управление,
            // и объединить результат.
            sum = subTaskA.join() + subTaskB.join();
        }
        // Возвратить окончательную сумму.
        return sum;
    }
}
// Демонстрация параллельного выполнения.
class RecurTaskDemo {
    public static void main(String[] args) {
        // Создать пул задач.
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[5000];
        // Инициализировать nums чередующимися положительными
        // и отрицательными значениями.
        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i % 2) == 0) ? i : -i);
        Sum task = new Sum(nums, 0, nums.length);
        // Запустить задачи ForkJoinTask. Обратите внимание,
        // что в этом случае метод invoke() возвращает результат.
        double summation = fjp.invoke(task);
        System.out.println("Результат суммирований: " + summation);
    }
}
