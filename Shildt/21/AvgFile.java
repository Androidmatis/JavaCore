import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Использование класса Scanner для расчета среднего значения.
class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;
        // Записать выходные данные в файл.
        FileWriter fout = new FileWriter("test.txt");
        fout.write("2 3,4 5 6 7,4 9,1 10,5 done");
        fout.close();
        FileReader fin = new FileReader("test.txt");
        Scanner scr = new Scanner(fin);
        // Читать и суммировать числа.
        while (scr.hasNext()) {
            if (scr.hasNextDouble()) {
                sum += scr.nextDouble();
                count++;
            }
            else {
                String str = scr.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("Ошибка формата данных.");
                    return;
                }
            }
        }
        scr.close();
        System.out.println("Среднее значение равно " + (sum / count));
    }
}
