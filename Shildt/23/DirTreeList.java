// Простой пример, в котором для отображения дерева каталогов
// используется метод walkFileTree().
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
// Создать специальную версию класса SimpleFileVector,
// в котором переопределяется метод visitFile().
class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs)
        throws IOException
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
class DirTreeList {
    public static void main(String[] args) {
        String dirname = "/home/andrey/IdeaProjects/JavaCore/Shildt";
        System.out.println("Дерево каталогов, начиная с " + dirname + ":\n");
        try {
            Files.walkFileTree(Path.of(dirname), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
