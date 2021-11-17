import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class main {
    public static void main(String args[]) throws Exception {

        System.out.println("Изменение строки в нижний регистр: " + lowerReg("ЗАГЛАВНЫЕ БУКВЫ"));

        System.out.println("Изменение строки в верхний регистр: " + upperReg("заглавные буквы"));

        System.out.println("Второй по частоте символ в строке: " + nMostCommon("аааббввг", 2));

        System.out.println("После удаления дубликатов в строке: " + delDuplicate("aabsdef"));

        System.out.println("Первый неповторяющийся символ: " + get("aaabbccdef"));

        System.out.println("Первые два символа, появляющиеся в конце: " + repeatChar("hellohe"));

        System.out.println("Кол-во символов, которые повторяются три раза подряд в строке: " + tripleChar("aaabbcdef"));

        System.out.println("Сумма цыфр, присутствующих в строке: " + sumFromString("a4b3bvbfb61"));
    }


    // Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр.
    public static String upperReg(String s) {
        //String str = "заглавные буквы";
        String strUpper = s.toUpperCase();
        System.out.println("Оригинал строки: " + s);

        return strUpper;
    }

    // Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр.
    public static String lowerReg(String s) {
        String strLower = s.toLowerCase();
        System.out.println("Оригинал строки: " + s);

        return strLower;
    }

    // Напишите программу на Java, чтобы найти второй по частоте символ в данной строке.
    public static char nMostCommon(String str, int n) {
        Map<Character, Long> counter = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        if (counter.size() < n) {
            throw new IllegalArgumentException("Не хватает символов");
        }
        return counter.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .get(n - 1);
    }

    // Напишите программу на Java для печати после удаления дубликатов из заданной строки.
    public static String delDuplicate(String s) {
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i<chars.length-1; i++) {
            if (chars[i] != chars[i+1]) {
                res.append(chars[i]);
            }
            if (i+1 == chars.length-1) res.append(chars[i+1]);
        }
        return res.toString();
    }

    // Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке.
    public static char get(String s) {
        if (s.length() == 0) {
            System.out.println("Fail");
            System.exit(0);
        } else {
            Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

            for (int i = 0; i < s.length(); i++) {
                if (m.containsKey(s.charAt(i))) {
                    m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
                } else {
                    m.put(s.charAt(i), 1);
                }
            }
            for (Map.Entry<Character, Integer> hm : m.entrySet()) {
                if (hm.getValue() == 1) {
                    return hm.getKey();
                }
            }
        }
        return 0;
    }

    // Напишите программу на Java, которая возвращает true из заданной строки,
    // если первые два символа в строке также появляются в конце.
    public static String repeatChar(String s){
        String string = s.substring(0,2);

        return string;
    }

    // Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке.
    public static int tripleChar(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int curr_count = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            curr_count += 1;
            if (chars[i] != chars[i + 1]) {
                if (curr_count == 3)
                    count++;
                curr_count = 0;
            } else if (i + 1 == chars.length - 1) {
                curr_count += 1;
                if (curr_count == 3)
                    count++;
            }
        }
        return count;
    }

    // Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке. Если цифр нет, возвращаемая сумма равна 0.
    static int sumFromString(String s){
        int sum = 0;
        for(int i = 0; i < s.length() ; i++){
            if( Character.isDigit(s.charAt(i)) ){
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        return sum;
    }
}
