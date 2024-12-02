import java.io.*;

// Демонстрация использования DataInputStream и DataOutputStream.
class DataIODemo {
    public static void main(String[] args) {
        // Для начала записать данные.
        try (DataOutputStream dout =
                new DataOutputStream(new FileOutputStream("Test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть выходной файл");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        // Теперь прочитать данные.
        try (DataInputStream din =
                new DataInputStream(new FileInputStream("Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Полученные значения: " +
                    d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть входной файл");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
