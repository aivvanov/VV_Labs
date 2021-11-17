import java.util.Scanner;

public class lab5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next();
        palindrome(n1);

        String str = scanner.next();
        System.out.println(removeSpaces(str));

        System.out.println("Является ли Alex и leAx анаграммами? -" + isAnagram("Alex", "leAx")); // анаграмма
        System.out.println("Является ли hello и helo анаграммами? -" + isAnagram("hello", "helo")); // не анаграмма

        lcompare(n1);

        regCompare(n1);

        combineStrings(n1);

        compareString(n1);

        stringEnding(n1);

        stringEquals(n1);

        stringLength(n1);
    }

    // Написать программу, которая проверяет, является ли строка палиндромом
    public static void palindrome(String n) {
        String reverse = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse = reverse + n.charAt(i);
        }
        if (n.equals(reverse))
            System.out.println("Строка является полиндромом");
        else
            System.out.println("Строка не является полиндромом");

    }

    // Реализовать удаление повторяющихся символов в строке
    public static String removeSpaces(String str) {
        String ourString = "";
        int j = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            j = i + 1;
            if (str.charAt(i) != str.charAt(j)) {
                ourString += str.charAt(i);
            }
        }
        return ourString;
    }

    public boolean anagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            value += ((int) s.charAt(i)) ^ 2;
            value -= ((int) t.charAt(i)) ^ 2;
        }
        return value == 0;
    }

    // Реализовать проверку, являются ли две строки анаграммами
    public static boolean isAnagram(String first, String second) {
        String positive = first.toLowerCase();
        String negative = second.toLowerCase();

        if (positive.length() != negative.length()) {
            return false;
        }

        int[] counts = new int[26];
        int diff = 0;

        for (int i = 0; i < positive.length(); i++) {
            int pos = (int) positive.charAt(i) - 97;
            if (counts[pos] >= 0) {
                diff++;
            } else {
                diff--;
            }
            counts[pos]++;
            int neg = (int) negative.charAt(i) - 97;
            if (counts[neg] <= 0) {
                diff++;
            } else {
                diff--;
            }
            counts[neg]--;
        }
        return diff == 0;
    }

    // Напишите Java-программу для лексикографического сравнения двух строк.
    public static void lcompare(String st) {
        String str1 = "Привет, как дела?";
        String str2 = "Привет, как дела?";
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Строки лексически равны");
        } else {
            System.out.println("Строки лексически не равны");
        }
    }

    // Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре.
    public static void regCompare(String s) {
        String str1 = "Пример номер 1";
        String str2 = "пример Номер 1";

        int result = str1.compareToIgnoreCase(str2);
        if (result < 0) {
            System.out.println("\"" + str1 + "\"" +
                    " меньше " +
                    "\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" +
                    " равен " +
                    "\"" + str2 + "\"");
        } else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                    " больше " +
                    "\"" + str2 + "\"");
        }
    }

    // Напишите программу на Java для объединения данной строки в конец другой строки.
    public static void combineStrings(String sr) {
        String str1 ="Я люблю ";
        String str2 ="язык Java";

        String str3 = str1.concat(str2);
        System.out.println("Объединенная строка: " + str3);
    }

    // Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов.
    public static void compareString(String compare) {
        String str1 ="Пример", str2 ="пример";
        CharSequence cs ="пример";
        System.out.println("Равна ли строка '" + str1 + "' и последовательность символов '" + cs +"'? -" + str1.contentEquals(cs));
        System.out.println("Равна ли строка '" + str2 + "' и последовательность символов '" + cs + "'? -" + str2.contentEquals(cs));
    }

    // Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки.
    public static void stringEnding(String strEnding){
        String str1 ="Пример № один";
        String str2 ="Пример № два";
        String end_str ="один";
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);
        System.out.println("\"" + str1 + "\" заканчивается на " + "\"" + end_str + "\"? -" + ends1);
        System.out.println("\"" + str2 + "\" заканчивается на " + "\"" + end_str + "\"? -" + ends2);
    }

    // Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные.
    public static void stringEquals(String strEnding) {
        String a = new String("foo");
        String b = new String("foo");
        System.out.println("Содержат ли две строки одинаковые данные? -" + a.equals(b));
    }

    // Напишите Java-программу, чтобы получить длину заданной строки.
    public static void stringLength(String strLength){
        String Str1 = new String("Хэллоу, ворлд!");

        System.out.print("Длина строки '" + Str1 + "' равна: " + Str1.length());
    }
}





