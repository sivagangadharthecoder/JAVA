import java.util.*;

public class Armstrong{
    public static void main(String args[]) {
        Scanner obj= new Scanner(System.in);
       
       System.out.println("Enter Any Positive Integer: ");
       int num = obj.nextInt();
       
       int length = 0;

       int sum = 0;

       int temp = num;
       while(num > 0){
       	num = num / 10;
       	length++;
       }

       num = temp;
       while(num > 0){
       	int rem = num % 10;
       	sum = sum + (int)Math.pow(rem , length);
       	num = num / 10;
       }

       if(temp == sum){
       	System.out.println(temp + " is armstrong number");
       }
       else{
       	System.out.println(temp + "is not armstrong number");
       }

    }
}
