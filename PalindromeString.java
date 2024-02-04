import java.util.*;

public class PalindromeString{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        String str = obj.next();
        
        int length = str.length();
        
        boolean flag = true;
        for(int i=0; i<(length / 2); i++)
        {
            if(str.charAt(i) != str.charAt(length - i-1))
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
        {
            System.out.println(str+ " is PalindromeString");
        }
        else{
            System.out.println(str + " is not PalindromeString");
        }
        
    }
}
