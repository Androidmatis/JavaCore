import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

// Копирование фала с использованием системы NIO.
class NIOCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Использование: copy исходный-файл целевой-файл");
            return;
        }
        try {
            Path source = Path.of(args[0]);
            Path target = Path.of(args[1]);
            // Копировать файл.
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка пути: " + e);
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
