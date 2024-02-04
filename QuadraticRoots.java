import java.util.*;

public class QuadraticRoots{
public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter co-efficient a: ");
	int a = obj.nextInt();
	System.out.println("Enter co-efficient b: ");
	int b = obj.nextInt();
	System.out.println("Enter co-effient c: ");
	int c = obj.nextInt();
	
	double d = b * b - 4 * a * c;
	
	if(d > 0)
	{
		System.out.println("Roots are real and different !");
		double r1 = (-b + Math.sqrt(d)) / 2*a;
		double r2 = (-b - Math.sqrt(d)) / 2*a;

		System.out.println(r1 + " and "+ r2);
	}
	else if(d == 0)
	{
		System.out.println("Roots are real and equal !");
		double r1 = -b / 2*a;
		double r2 = -b / 2*a;

		System.out.println("r1 = r2 = "+r1);
	}
	else {
		System.out.println("Roots are imaginary and different !");
		double real = -b / 2*a;
		double imaginary = Math.sqrt(-d) / 2*a;

		System.out.println(real + " + "+ imaginary+"i");
		System.out.println(real + " - "+ imaginary+"i");
	}		
}
}
