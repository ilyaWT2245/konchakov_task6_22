import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите x: ");
        double x = s.nextDouble();
        System.out.println("Введите n: ");
        int n = s.nextInt();
        System.out.println("Введите e: ");
        double e = s.nextDouble();

        double prev = 1, ans1 = 1, current, ans2 = 0, ans3 = 0, ans4;
        if (e < 1) {
            ans2 += 1;
        }
        if (e/10 < 1) {
            ans3 += 1;
        }

        for (int i = 1; i <= n; i++) {
            current = f(i, prev, x);
            ans1 += current;
            if (e < Math.abs(current)) {
                ans2 += current;
            }
            if (e/10 < Math.abs(current)) {
                ans3 += current;
            }
            prev = current;
        }
        ans4 = Math.pow(2, x);

        System.out.println("Сумма n слагаемых = " + ans1);
        System.out.println("Сумма слагаемых, больше, чем е = " + ans2);
        System.out.println("Сумма слагаемых, больше, чем е/10 = " + ans3);
        System.out.println("Значение функции = " + ans4);

    }

    public static double f(int n, double prev, double x) {
        return prev * x / n * Math.log(2);
    }
}