import java.util.*;
import java.lang.*;
import java.io.*;

class INSTAGRAM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj = new Scanner(System.in);
		
		int t = obj.nextInt();
		for(int i=0; i<t; i++)
		{
		    int a = obj.nextInt();
		    int b = obj.nextInt();
		    
		    if(b * 10 < a)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
