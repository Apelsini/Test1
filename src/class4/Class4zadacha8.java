package class4;

public class Class4zadacha8 {
    public static void main(String[] args) {
        String str = "В этой   строке  считается   количество   слов";
        System.out.println(str);
        System.out.println(numwords(str));

    }

    /*
    Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
     */
    public static int numwords (String isxodnaya) {
        int wrds=0;
        char[] chars = isxodnaya.toCharArray();
        for (int i=1; i<chars.length; i++) {
            if (chars[i]==' ') {
                if (chars[i]!=' ') {
                    wrds++;
                }
            }
        }

        return wrds;
    }
}
