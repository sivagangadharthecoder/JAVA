import java.util.*;
import java.lang.*;
import java.io.*;

class REACH_HOME
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj = new Scanner(System.in);
		
		int t = obj.nextInt();
		for(int i=0; i<t; i++)
		{
		    int x = obj.nextInt();
		    int y = obj.nextInt();
		    
		    if(x * 5 >= y)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
