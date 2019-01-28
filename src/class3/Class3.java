package class3;

import java.util.Random;

public class Class3 {
    public static void main(String[] args) {

        pechatmassiv();

        print100num1317();

        arrayof4randomnum();

        TwoDMassivcompare();

        AceofSpades();

    }

    /**
     * // Напишите программу, которая печатает массив сначала в обычном порядке,
     * // затем в обратном
     */
    private static void pechatmassiv() {
        int[] arr = {1, 3, 5, 7, 3, 4, 5, 6, 9, 10};
        System.out.println(" практика. задача 1 ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("  " + arr[i]);
        }
        System.out.println("  ");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print("  " + arr[i]);
        }
        System.out.println("  ");
    }

    /**
     * Напишите программу, заносящую в массив первые 100 натуральных чисел,
     * делящихся на 13 или на 17, и печатающую его.
     */
    private static void print100num1317() {
        System.out.println(" практика. задача 2 ");
        int[] mas = new int[100];
        int count = 0;
        int chislo = 0;
        while (count < 100) {
            chislo++;
            if ((chislo % 13 == 0) | (chislo % 17 == 0)) {
                mas[count] = chislo;
                count++;
            }
        }
        for (int i = 0; i < mas.length - 1; i++) {
            System.out.println(count + ":  " + mas[i]);
        }
    }

    /**
     * Создать массив из 4 случайных целых чисел из отрезка [10;99],
     * вывести его на экран в строку.     Определить и вывести на экран
     * сообщение о том, является ли массив строго возрастающей последовательностью.
     */

    private static void arrayof4randomnum() {
        long[] arra = new long[4];
        System.out.println("  ");
        System.out.println(" практика. задача 3 ");
        for (int i = 0; i < 4; i++) {
            arra[i] = Math.round(Math.random() * 100);
            System.out.print(" " + arra[i]);
        }
        System.out.println("  ");
        boolean vozrast = true;
        for (int i = 1; i < arra.length - 1; i++) {
            if (arra[i] < arra[i - 1]) {
                vozrast = false;
            }
        }
        if (vozrast) {
            System.out.println(" является строго возрастающей последовательностью ");
        } else {
            System.out.println(" не является строго возрастающей последовательностью ");
        }


    }

    /**
     * Написать метод equals, который определяет,
     * равны ли между собой соответствующие элементы
     * 2-х двумерных массивов.
     */
    private static void TwoDMassivcompare() {
        int[][] mas1 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int[][] mas2 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        System.out.println(" практика. задача 4 ");
        boolean equalz = TwoDequals(mas1,mas2);
        if (equalz) {
            System.out.println("массивы совпадают");
        } else {
            System.out.println("массивы не совпадают");
        }

    }
    private static boolean TwoDequals (int m1[][], int m2[][]) {
        boolean eq = true;
        int i = 0;
        int j = 0;
        if ((m1.length != m2.length)&(m1[0].length!=m2[0].length)) {
        eq = false;
        } else {
            while ((eq)&(i <m1.length)) {
                while ((eq)&(j<m1[0].length)) {
                    if (m1[i][j]!=m2[i][j]) {
                        eq=false;
                    }
                    j++;
                }
                i++;
            }
        }
        return eq;
        }

    /**
     *     private static void TwoDMassivcompare() {
     */
    private static void AceofSpades() {
        String[] cards = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] mast ={"Hearts","Spades","Clubs","Diamonds"};
        int card = getRandomNumberInRange(1,52);
        int index1 = card-Math.floorDiv(card, 4)*4-1;
      System.out.println("загадана карта № "+card);
       System.out.println(cards[index1]+" of "+mast[card % 4]);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    /**
    Создать двухмерный квадратный массив, и заполнить его бабочкой, т.е. таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
Вывести его на экран, заменив 1 символом *, а 0 - пробелом.
     */



}
