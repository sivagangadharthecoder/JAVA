import java.util.*;
import java.lang.*;
import java.io.*;

class OneMoreEpisode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner obj = new Scanner(System.in);
        
        int t = obj.nextInt();
        for(int i=0; i<t; i++)
        {
            int time = obj.nextInt();
            if(time > 24)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
	}
}
