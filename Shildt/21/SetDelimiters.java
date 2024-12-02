import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Использование класса Scanner для расчета среднего по списку значений,
// разделенных запятыми.
class SetDelimiters {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;
        // Записать выходные данные в файл.
        FileWriter fout = new FileWriter("test.txt");
        // Сохранить значения в списке, разделяя их запятыми.
        fout.write("2; 3,4;   5;6; 7,4; 9,1; 10,5; done");
        fout.close();
        FileReader fin = new FileReader("test.txt");
        Scanner src = new Scanner(fin);
        // Установить пробел и запятую в качестве разделителей.
        src.useDelimiter("; *");
        // Читать и суммировать числа.
        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            }
            else {
                String str = src.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("Ошибка формата файла.");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Среднее значение равно: " + (sum / count));
    }
}
