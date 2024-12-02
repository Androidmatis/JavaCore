import java.io.FileOutputStream;
import java.io.IOException;

// Демонстрация использования FileOutputStreamDemo.
// В этой программе применяется традиционный подход к закрытию файла.
class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Настало время всем порядочным людям\n" +
                " прийти на помощь своей стране\n" +
                " и заплатить надлежащие налоги.";
        byte[] buf = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");
            // Записать в первый файл.
            for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);
            // Записать во второй файл.
            f1.write(buf);
            // Записать в третий файл.
            f2.write(buf, (buf.length - (buf.length / 4)), (buf.length / 4));
        } catch (IOException e) {
            System.out.println("Возникла ошибка ввода-вывода");
        } finally {
            try {
                if (f0 != null) f0.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии file1.txt");
            }
            try {
                if (f1 != null) f1.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии file2.txt");
            }
            try {
                if (f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии file3.txt");
            }
        }
    }
}
