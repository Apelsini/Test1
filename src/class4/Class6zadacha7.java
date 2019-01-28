package class4;

public class Class6zadacha7 {
    public static void main(String[] args) {
        String oper = "1234123412341324";
        bubblestring(oper, 4);
    }

    /*
    Написать функцию, разбивающую строку на равные части по n символов
    и сохраняющую отдельные части в массив. Вывести этот массив.
     */
    public static void bubblestring(String argm, int numparts) {
        char[] chars = argm.toCharArray();
        int len = chars.length;
        String[] strings = new String[numparts];
        String subs;
        if ((numparts > 0) & (len % numparts == 0)) {
            int razmerchasti = Math.floorDiv(len, numparts);
            for (int i = 0; i < numparts-2; i++) {
                subs = argm.substring(i * razmerchasti, razmerchasti);
                strings[i] = subs;
            }
            for (int i = 0; i < numparts-1; i++) {
                System.out.println(strings[i]);
            }
        } else {
            System.out.println("данная строка на " + numparts + " не разбивается");
        }
    }


}
