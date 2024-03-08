public class Main {
    public static void main(String[] args) {
        //  Задайте значения M и N. Напишите программу, которая выведет все
        //  натуральные числа в промежутке от M до N. Использовать рекурсию, не использовать циклы.
        int m = 1;
        int n = 10;

        System.out.print("Натуральные числа от " + m + " до " + n + "\n"  );
        printNaturalNumbers(m, n);


    }
    public static  void printNaturalNumbers(int m , int n) {
        if (m <= n) {
            System.out.println(m);
            printNaturalNumbers(m + 1, n);
        }
    }
}