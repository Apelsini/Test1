package class10_io;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by user on 15.02.2019.
 * 1.Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */
public class Class10Launcher {
    public static void main(String[] args) throws IOException {
        //Files.newInputStream(Paths.get("C:\\Users\\user\\IdeaProjects\\Test1\\src\\class9exceptions", "OwnException.java"));
    List<String> rd = Files.readAllLines(Paths.get("C:\\Users\\user\\IdeaProjects\\Test1\\src\\class9exceptions", "OwnException.java"));
      rd.forEach(item->System.out.println(item));
    }
}
