package class11regexp;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by user on 18.02.2019.
 */
public class regexpMaxnumbers {
    public static void main(String[] args) throws IOException {
        String regex2 = "\\d+";
        String wrds = "bgb12123  1231354  1231231 515148";

        List<String> rd = Files.readAllLines(Paths.get("C:\\Users\\user\\IdeaProjects\\Test1\\src\\class10_io", "txt.txt"));
        for (int i = 0; i < rd.size(); i++) {
            System.out.println("string "+i+" >>"+matcher(regex2, rd.get(i)));
        }



}
    public static String matcher (String spat, String swords) {
        Pattern pat = Pattern.compile(spat);
        Matcher matcher = pat.matcher(swords);
        String maxLenghtWord = "";
        while (matcher.find()) {
            String fnd = matcher.group();
            if (fnd.length() > maxLenghtWord.length()) {
                maxLenghtWord = fnd;
            }
        }
       return maxLenghtWord;
    }


}

