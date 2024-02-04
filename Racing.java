import java.util.*;

public class Racing{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);

		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int d = obj.nextInt();
		int e = obj.nextInt();

		double avg = (a + b + c + d + e) / 5.0;

		System.out.println("minimum speed to qualify is : "+ avg);

		if(a > avg)
		{
			System.out.println("racer 1 qualified with speed " + a);
		}
		if(b > avg)
		{
			System.out.println("racer 2 qualified with speed "+ b);
		}
		if(c > avg)
		{
			System.out.println("racer 3 qualified with speed "+ c);
		}
		if(d > avg)
		{
			System.out.println("racer 4 qualified with speed "+ d);
		}
		if(e > avg)
		{
			System.out.println("racer 5 qualified with speed "+ e);
		}

	}
}