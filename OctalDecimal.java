import java.util.Scanner;

public class OctalDecimal{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int num = obj.nextInt();
        
        // digits of number
        int temp = num;
        int count = 0;
        while(num > 0)
        {
            num = num / 10;
            count = count + 1;
        }
        
        // octal to decimal
        int sum = 0;
        int power = 0;
        for(int i=0; i<count && temp > 0; i++)
        {
            int rem = temp % 10;
            sum += rem * Math.pow(8 ,power);
            temp = temp / 10;
            power++;
        }
        System.out.println(sum);
    }
}

