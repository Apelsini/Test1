package class4;

public class class4 {
    public static void main(String[] args) {


        System.out.println(" Задача 2 Заменить все грустные смайлы :( в строке на весёлые :) ");
        String ar = "Грустные :( очень :( смайлики :(";
        System.out.println(ar);
        System.out.println(replace(ar));

        System.out.println(ar.replaceAll(":\\(", ":)"));


        System.out.println(" Задача 3 вывести true если строка начинается и заканчивается с заданной подстроки ");
        String strk = "str this string strts and ens with str";
        System.out.println(strk);
        System.out.println(containz(strk, "str"));
        System.out.println(" Задача 4 Вывести сачек Петр владимирович в режиме С.П.В.");
        System.out.println(fio("сачек", "Петр", "владимирович"));


        System.out.println(" Задача 5 сравнить два массива строк на предмет их совпадения без учета позиции");
        String[] ar1 = {"Ivan", "Boris", "Evgeny"};
        String[] ar2= {"Ivan", "Evgeny", "Boris"};
        System.out.println(equalarrays(ar1, ar2));

        System.out.println(" Задача 6 Подсчитать количество всех точек, запятых и восклицательных знаков в строке.");
    }

    /*
Заменить все грустные смайлы :( в строке на весёлые :)
    }
     */
    public static String replace(String args) {
        char[] chars = args.toCharArray();
        for (int k = 1; k < chars.length - 1; k++) {
            if (chars[k] == '(') {
                if (chars[k - 1] == ':') {
                    chars[k] = ')';
                }
            }
        }
        return new String(chars);
    }

    /*Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую
    true, если строка начинается и заканчивается этим словом
         */
    public static boolean containz(String stroka, String slovo) {
        boolean contnz = false;
        if ((stroka.startsWith(slovo)) & (stroka.endsWith(slovo))) {
            contnz = true;
        }
        return contnz;
    }

    /*
    Написать функцию, принимающую в качестве параметров имя, фамилию и отчество
    и возвращающую инициалы в формате Ф.И.О. Учесть, что входные параметры могут быть
    в любом регистре, а результирующая строка должна быть в верхнем.
         */
    public static String fio(String name, String surname, String fathersname) {
        String fioz = name.substring(0, 1).toUpperCase() + "." +
                surname.substring(0, 1).toUpperCase() + "." +
                fathersname.substring(0, 1).toUpperCase() + ".";
        return fioz;
    }

    /*
    Заданы два массива строк. Написать функцию, определяющую, является ли содержимое
    этих массивов идентичным. Порядок расположения элементов значения не имеет.
     */
    public static boolean equalarrays(String[] arr1, String[] arr2) {
        boolean equ = true;
        for (int i = 0; i<arr1.length; i++){
            String elem = arr1[i];
            boolean found = false;
            for (int j = 0; j<arr2.length; j++){
                if (arr2[j].equals(elem)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                equ = false;
            }
        }
        return equ;
    }
}
