package class10_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.02.2019.
 * Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 */
public class GlasnyTekst {
    public static void main(String[] args) throws IOException {

        List<String> rd = Files.readAllLines(Paths.get("C:\\Users\\user\\IdeaProjects\\Test1\\src\\class10_io", "txt.txt"));
        List<String> oneString = new ArrayList<>();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (String item : rd) {
            oneString.addAll(stringToWords(item));
          // zadacha s glasnimi
            /*  if (!oneString.isEmpty()) {
                for (int j = 0; j < oneString.size(); j++) {
                    if (WordBeginsWith(oneString.get(j), vowels)) {
                        System.out.println(oneString.get(j));
                    }
                }
            }*/

// zadacha s sovpadeniem nachalnoi i konechnoi bukvi dvuh sosednih slov
            if (!oneString.isEmpty()) {
                for (int j = 1; j < oneString.size(); j++) {
                    if (oneString.get(j).charAt(0)==oneString.get(j-1).charAt(oneString.get(j-1).length()-1)) {
                        System.out.println(oneString.get(j-1)+"-"+oneString.get(j));
                    }
                }
            }


        }




    }


    public static List<String> stringToWords(String s) {
        int begin = 0;
        List<String> out = new ArrayList<>();
        String word;
        for (int end = 1; end < s.length(); end++) {
            if (s.charAt(end) == ' ') {
                word = s.substring(begin, end);
                begin = end+1;
                out.add(word);
              //  System.out.println(word);
            }
        }
        return out;
    }

    public boolean WordBeginsWith(String word, char[] arrayOfFirstChars) {
        boolean begins = false;
        for (int i = 0; i < arrayOfFirstChars.length; i++) {
            if (word.charAt(0) == arrayOfFirstChars[i]) {
                begins = true;
            }
        }
        return begins;
    }


}
