import java.util.Scanner;

class FibonacciSum {
    public static void main(String args[]) {
        int ft = 0, st = 1;
        int t, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range for Fibonacci Series:");
        int n = input.nextInt();
        System.out.println("The Fibonacci Series is as follows:");
        System.out.print(ft);
        System.out.print(" " + st);
        for (int i = 2; i <= n; i++) {
            t = ft + st;
            System.out.print(" " + t);
            if (i % 2 == 0)
                sum = sum + t;
            ft = st;
            st = t;
        }
        System.out.println("\n" + "Sum of Even Terms in Fibonacci Series upto a range " + n + " is: " + sum);
    }
}
