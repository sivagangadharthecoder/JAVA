import java.util.*;
import java.lang.*;
import java.io.*;

class RIGHTTHERE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj = new Scanner(System.in);
		
		int t = obj.nextInt();
		for(int i=0; i<t; i++)
		{
		    int n = obj.nextInt();
		    int c = obj.nextInt();
		    
		    if(n <= c)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		
	}
}
