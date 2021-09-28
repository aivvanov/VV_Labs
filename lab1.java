import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        printLastDigit();
        printSumOfThreeDigit();
        printConditionalNum();
        printConditionalNum2();
        printMinNumber();
        printInfoAboutNum();
        printCallCost();
        workWithArray1();
        reverseArray();
        moveZerosToEnd();
    }

    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input number: ");
        return sc.nextInt();
    }

    // Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа
    public static void printLastDigit() {
        int number = inputNumber();
        int lastDigit = number % 10;
        System.out.println("Last digit: " + lastDigit);
        System.out.println();
    }

    // Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
    public static void printSumOfThreeDigit() {
        int number = inputNumber();

        int thirdDigit = number % 10;
        number = number / 10;
        int secondDigit = number % 10;
        int firstDigit = number / 10;
        int sumDigit = firstDigit + secondDigit + thirdDigit;

        System.out.println("Sum of three digit: " + sumDigit);
        System.out.println();
    }

    // Ввести целое число в консоли. Если оно является положительным, то прибавить 
    // к нему 1, в противном случае не изменять его. Вывести полученное число.
    public static void printConditionalNum() {
        int number = inputNumber();
        
        if (number > 0) {
            number++;
        }

        System.out.println("Result: " + number);
        System.out.println();
    }

    //  Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1;
    // если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
    public static void printConditionalNum2() {
        int number = inputNumber();
        
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }

        System.out.println("Result: " + number);
        System.out.println();
    }

    //  Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public static void printMinNumber() {
        int number1 = inputNumber();
        int number2 = inputNumber();
        int number3 = inputNumber();

        int min = min(number1, min(number2, number3));

        System.out.println("Min: " + min);
        System.out.println();
    }

    //  Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число»,
    // «нулевое число», «положительное нечетное число» и т. д.
    public static void printInfoAboutNum() {
        int number = inputNumber();
        String info = "";

        if (number < 0) {
            info = "negative ";
        } else {
            info = "positive ";
        }

        if (number % 2 == 0) {
            info += "even number";
        } else {
            info += "odd number";
        }

        if (number == 0) {
            info = "zero number";
        }

        System.out.println(info);
        System.out.println();
    }

    // Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города. 
    // ( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ).
    // Пользователь в консоли должен ввести код города, а в ответ от программы получить, например,
    // при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
    public static void printCallCost() {
        int code = inputNumber();
        int minut = 10;

        if (code == 905) {
            System.out.println("Moscow. Call cost: " + (4.15 * minut));
        } else if (code == 194) {
            System.out.println("Rostov. Call cost: " + (1.98 * minut));
        } else if (code == 491) {
            System.out.println("Krasnodar. Call cost: " + (2.69 * minut));
        } else if (code == 800) {
            System.out.println("Kirov. Call cost: " + (5.00 * minut));
        } else {
            System.out.println("There is no city code");
        }
    }

    //  Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. 
    // Для данного массива найти и вывести на экран: максимальное значение, сумму положительных элементов
    // сумму четных отрицательных элементов, количество положительных элементов,
    // среднее арифметическое отрицательных элементов
    public static void workWithArray1() {
        int[] array = { 1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2 };

        int maxValue = array[0];
        int sumOfPositiveNum = 0;
        int sumOfNegativeNum = 0;
        int sumOfEvenNegativeNum = 0;
        int countOfPositiveNum = 0;
        int countOfNegativeNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }

            if (array[i] > 0) {
                sumOfPositiveNum += array[i];
            } else if (array[i] < 0) {
                sumOfNegativeNum += array[i];
            }

            if (array[i] % 2 == 0 && array[i] < 0) {
                sumOfEvenNegativeNum += array[i];
            }

            if (array[i] > 0) {
                countOfPositiveNum++;
            } else if (array[i] < 0) {
                countOfNegativeNum++;
            }
        }

        double averageOfNegativeNum = (double)sumOfNegativeNum / (double)countOfNegativeNum;

        System.out.println("Max value: " + maxValue);
        System.out.println("Sum of positive numbers: " + sumOfPositiveNum);
        System.out.println("Sum of even negative numbers: " + sumOfEvenNegativeNum);
        System.out.println("Count of positive numbers: " + countOfPositiveNum);
        System.out.println("Average of negative numbers: " + averageOfNegativeNum);
        System.out.println();
    }

    // Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52]. 
    // Переставить элементы массива в обратном порядке. Вывести результат в консоль
    public static void reverseArray() {
        int[] array = { 15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52 };
        int[] reverseArr = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reverseArr[i] = array[j];
        }

        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i] + ", ");
        }
        System.out.println();
    }

    //  Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. 
    // Переместить нули в конец массива. Вывести результат в консоль
    public static void moveZerosToEnd() {
        int[] array = { 15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52 };

        boolean swap = false;
        while (!swap) {
            swap = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 0 && array[i + 1] != 0) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = false;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();
    }
}