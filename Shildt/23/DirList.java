// Отображение содержимого каталога.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class DirList {
    public static void main(String[] args) {
        String dirname = "/home/andrey/IdeaProjects/JavaCore/Shildt/23";
        // Создать фильтр, который возвращает true только для файлов,
        // допускающих запись.
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            public boolean accept(Path path) throws IOException {
                if (Files.isWritable(path)) return true;
                return false;
            }
        };
        // Получить управление потоком каталога внутри блока try.
        try (DirectoryStream<Path> dirstrm =
                Files.newDirectoryStream(Path.of(dirname), how))
        {
            System.out.println("Каталог " + dirname);
            // Поскольку DirectoryStream расширяет Iterable,
            // для отображения содержимого
            // каталога можно использовать цикл for в стиле "for-each".
            for (Path entry : dirstrm) {
                BasicFileAttributes attribs =
                        Files.readAttributes(entry, BasicFileAttributes.class);
                if (attribs.isDirectory())
                    System.out.print("<KAT> ");
                else
                    System.out.print("      ");
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка пути: " + e);
            return;
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " не является каталогом.");
        }  catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
