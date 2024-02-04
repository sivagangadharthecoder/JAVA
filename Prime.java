import java.util.*;

public class Prime{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int i, j;
        for (i = 2; i <= 100; i++) {
            int count = 0; // Reset count for each number i

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 1;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(i + " "); // Print prime number inside the outer loop
            }
        }
    }
}
