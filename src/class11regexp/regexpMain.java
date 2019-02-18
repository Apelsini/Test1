package class11regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by user on 18.02.2019.
 */
public class regexpMain {
    public static void main(String[] args) {
        String regex = "(\\w+(\\w))\\s+((\\w)\\w+)";

        Pattern pat = Pattern.compile(regex);
        Matcher words = pat.matcher("asd dasd dsaa ass");

        while (words.find()) {
            String last = words.group(2);
            String fstNext = words.group(4);
            if (last.equals(fstNext)) {
                System.out.println(words.group(1));
                }
        }


    }


}