package class10_io;

/**
 * Created by user on 18.02.2019.
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReverseOrderChars {
    public static void main(String[] args) throws IOException {
      /*  System.out.println("abcdefg");
        System.out.println(revOrder("abcdefg"));*/
        List<String> rd = Files.readAllLines(Paths.get("C:\\Users\\user\\IdeaProjects\\Test1\\src\\class9exceptions", "OwnException.java"));
        for (int i = 0; i < rd.size(); i++) {
            rd.set(i, rd.get(i));
        }
        try (FileWriter fw = new FileWriter(new File("C:\\Users\\user\\IdeaProjects\\Test1\\src\\class10_io" + "out.java"))) {
            for (int i = 0; i < rd.size(); i++) {
                fw.write(revOrder(rd.get(i)));
            }
        }


    }

    public static String revOrder (String s) {

        char[] arr = s.toCharArray();
        char[] res = s.toCharArray();

        for (int i=s.length()-1; i>=0; i--) {
            res[i]=arr[arr.length-1-i];
          //  output.concat(s.substring(i,1));
        }

        return new String(res);
    }
}
