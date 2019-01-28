package class4;

public class Class4zadacha6 {
    public static void main(String[] args) {
String st = "Str4ange string ! , . . . , , !..";
        System.out.println(st);
        System.out.println(" в строке восклицательных знаков нашлось:"+counterstring(st,'!'));
        System.out.println(" в строке точек нашлось:"+counterstring(st,'.'));
        System.out.println(" в строке запятых нашлось:"+counterstring(st,','));
    }
    /*
    Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
     */
    public static int counterstring (String stroka, char substrtosearch) {
        char[] chars = stroka.toCharArray();
        int cntrstrng =0;
        for (int k = 0; k < chars.length; k++) {
            if (chars[k] == substrtosearch) {
                cntrstrng++;
            }
        }
        return cntrstrng;
    }
}
