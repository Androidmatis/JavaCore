// Получение информации о пути и файле.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class PathDemo {
    public static void main(String[] args) {
        Path filepath = Path.of("/home/andrey/IdeaProjects/JavaCore/Shildt/23/test.txt");
        System.out.println("Имя файла: " + filepath.getName(1));
        System.out.println("Путь: " + filepath);
        System.out.println("Абсолютный путь: " + filepath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filepath.getParent());
        if (Files.exists(filepath))
            System.out.println("Файл существует");
        else
            System.out.println("Файл не существует");
        try {
            if (Files.isHidden(filepath))
                System.out.println("Файл является скрытым");
            else
                System.out.println("Файл не является скрытым");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        Files.isWritable(filepath);
        System.out.println("Файл допускает запись");
        Files.isReadable(filepath);
        System.out.println("Файл допускает чтение");
        try {
            BasicFileAttributes attribs =
                    Files.readAttributes(filepath, BasicFileAttributes.class);
            if (attribs.isDirectory())
                System.out.println("Файл является каталогом");
            else
                System.out.println("Файл не является каталогом");
            if (attribs.isRegularFile())
                System.out.println("Файл является обычным");
            else
                System.out.println("Файл не является обычным");
            if (attribs.isSymbolicLink())
                System.out.println("Файл является символической ссылкой");
            else
                System.out.println("Файл не является символической ссылкой");
            System.out.println("Время последней модификации файла: " +
                    attribs.lastModifiedTime());
            System.out.println("Размер файла в байтах: " + attribs.size());
        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e);
        }
    }
}
