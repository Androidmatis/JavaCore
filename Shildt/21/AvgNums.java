import java.util.Scanner;

// Использование класса Scanner для расчета среднего значения.
class AvgNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        System.out.println("Введите числа для расчета среднего значения " +
                "(или done для завершения).");
        // Читать и суммировать числа.
        while (conin.hasNext()) {
            if (conin.hasNextDouble()) {
                sum += conin.nextDouble();
                count++;
            }
            else {
                String str = conin.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("Ошибка формата данных.");
                    return;
                }
            }
        }
        conin.close();
        System.out.println("Среднее значение равно " + (sum / count));
    }
}
