package com.company;

//import java.util.Random;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        one();
//        checkIdentifier(); //2
//        three();
//        four();
//        five();
//        six();
//        seven();
//        eight();
//        removingSpaces(); //9
//        registerCheck(); //10
//        numberOfWords(); //11


    }

    //////////////////////////////////////////////////////////////////////////////
    public static void removingSpaces() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Сколько слов вы хотите ввести?");
        int count = enter.nextInt();
        String words = "";
        System.out.println("Введите слова: ");
        for (int i = 0; i < count; i++) {
            words += enter.next();
        }

        Scanner scan = new Scanner(words);

        String result = "";
        while (scan.hasNext()) {
            result += scan.next();
        }
        System.out.println(result);
    }

    //////////////////////////////////////////////////////////////////////////////
    public static void checkIdentifier() {
        int testing = 0;

        System.out.println("Введите слово: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char charWordArray[] = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (!(charWordArray[i] >= 'a' && charWordArray[i] <= 'z' ||
                    charWordArray[i] >= 'A' && charWordArray[i] <= 'Z' ||
                    charWordArray[i] == '_' ||
                    charWordArray[i] >= '0' && charWordArray[i] <= '9')) {
                testing = 1;
            }
        }
        if (testing != 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    //////////////////////////////////////////////////////////////////////////////

    public static void numberOfWords() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = enter.nextLine();
        int count = 0;

        if (word.length() != 0) {
            count++;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
    //////////////////////////////////////////////////////////////////////////////

    public static void registerCheck() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = enter.nextLine();
        char[] chWord = word.toCharArray();
        int countSmall = 0;
        int countBig = 0;

        for (int i = 0; i < word.length(); i++) {
            if (chWord[i] >= 'a' && chWord[i] <= 'z') {
                countSmall++;
            } else if (chWord[i] >= 'A' && chWord[i] <= 'Z') {
                countBig++;
            }
        }

        if (countSmall > countBig) {
            System.out.println("Букв в нижнем регистре больше");
        } else {
            System.out.println("Букв в верхнем регистре больше");
        }
    }
    //////////////////////////////////////////////////////////////////////////////

//    public static void test() {
//        Scanner enter = new Scanner(System.in);
//        System.out.println("Введите слово: ");
//        String word = enter.nextLine();
//        char[] chWord = word.toCharArray();
//        int id = 0;
//        int count = 0;
//        int storage = 0;
//
//        for (int i = 0; i < word.length(); i++) {
//            if (chWord[i] != ' ') {
//                count++;
//                id++;
//            } else if (count > storage) {
//                storage = count;
//                count = 0;
//                id++;
//            }
//        }
//
//        System.out.println(id);
//
//    }

    //////////////////////////////////////////////////////////////////////////////

    public static void four() {
        String row = "data 48 call 9 read13 blank0a";
        char[] chRow = row.toCharArray();
        int[] result = new int[row.length()];
        int j = 0;


        for (int i = 0; i < chRow.length; i++) {
            if (chRow[i] >= '0' && chRow[i] <= '9') {
                result[j] += (int) chRow[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(result));

    }

    //////////////////////////////////////////////////////////////////////////////

    public static void one() {
        Random random = new Random();
        int indexOfLetter;
        String row = "I am tired";
        char[] chRow = row.toCharArray();
        for (int i = 0; i < 20; i++) {
            if (chRow[0] == ' ') {
                continue;
            }
            indexOfLetter = random.nextInt(chRow.length);
            System.out.print(chRow[indexOfLetter]);
        }
    }

    //////////////////////////////////////////////////////////////////////////////

    public static void three() {
        String row = "did";
        String[] word = row.split(" ");
        String stringWithoutSpaces = "";
        String reverseStringWithoutSpaces = "";
        for (int i = 0; i < word.length; i++) {
            stringWithoutSpaces = word[i];
            reverseStringWithoutSpaces = reverse(stringWithoutSpaces);
        }
        if (stringWithoutSpaces.equals(reverseStringWithoutSpaces)) {
            System.out.println("Перевёртыш!");
        } else {
            System.out.println("Не перевёртыш!");
        }
    }

    public static String reverse(String str) {
        char[] resultChars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            resultChars[str.length() - 1 - i] = str.charAt(i);
        }
        return new String(resultChars);
    }
    //////////////////////////////////////////////////////////////////////////////

    public static void five() {
        String row = "akkkkkkkbc cde def";
        String[] word = row.split(" ");
        String stringWithoutSpaces = "";
        String finalWords = "";
        for (int i = 0; i < word.length; i++) {
            stringWithoutSpaces += word[i];
        }
        char[] chWords = stringWithoutSpaces.toCharArray();

        for (int i = 0; i < stringWithoutSpaces.length(); i++) {
            if (finalWords.indexOf(chWords[i]) == -1) {
                finalWords += chWords[i];
            } else {
                continue;
            }
        }
        System.out.println(finalWords);

    }

    //////////////////////////////////////////////////////////////////////////////

    public static void six() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        String oldRow = s.nextLine();
        System.out.println("Укажите подстроку, которую хотите заменить");
        String substring = s.nextLine();
        if (oldRow.indexOf(substring) == -1) {
            System.out.println("Попробуйте ещё, вы ничего не меняете!");
        } else {
            System.out.println("На что вы хотите изменить выделеную подстроку?");
            String newRow = s.nextLine();
            String finalRow = oldRow.replace(substring, newRow);
            System.out.println(finalRow);
        }
    }


    //////////////////////////////////////////////////////////////////////////////

    public static void seven() {
        String[] rows = {"sss", "kkk", "aaaa"};
        int a = 0;
        for (int i = 1; i < rows.length; i++) {
            if (rows[i].length() > rows[a].length()) {
                a = i;
            }
        }
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].length() == rows[a].length()) {
                System.out.println((i + 1) + " строка");
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////////

    public static void eight() {
        String s = "ssa wwwww vvvvvv";
        String[] slovaStroki = s.split(" ");
        int max = 0;
        for (int i = 0; i < slovaStroki.length; i++) {
            if (max < slovaStroki[i].length()) {
                max = slovaStroki[i].length();

            }
        }
        for (int i = 0; i < slovaStroki.length; i++) {
            if (max == slovaStroki[i].length()) {
                System.out.println(slovaStroki[i]);
                break;
            }
        }
        System.out.println(max);
    }

    //////////////////////////////////////////////////////////////////////////////


}




