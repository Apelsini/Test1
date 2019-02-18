package class10_io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by user on 15.02.2019.
 */
public class ChangePublic {
    public static void main(String[] args) throws IOException {
        List<String> rd = Files.readAllLines(Paths.get("C:\\Users\\user\\IdeaProjects\\Test1\\src\\class9exceptions", "OwnException.java"));
        for (int i = 0; i < rd.size(); i++) {
            rd.set(i, rd.get(i).replaceAll("public", "private"));
        }
        try (FileWriter fw = new FileWriter(new File("C:\\Users\\user\\IdeaProjects\\Test1\\src\\class10_io" + "out.java"))) {
            for (int i = 0; i < rd.size(); i++) {
                fw.write(rd.get(i).replaceAll("public", "private"));
            }
        }


    }
}
