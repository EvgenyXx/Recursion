public class Task2 {
    public static void main(String[] args) {
    // Напишите программу вычисления  Аккермана  помощью рекурсии.
        // Даны два неотрицательных числа m и n.
        int m = 2;
        int n = 1;
        int result = ackermann(m, n);
        System.out.println("Результат функции Аккермана для m = " + m + " и n = " + n + " равен " + result);


    }
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
}
