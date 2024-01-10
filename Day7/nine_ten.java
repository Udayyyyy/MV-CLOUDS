package Day7;
import java.util.*;

public class nine_ten {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        String [] wordsarray=str.split(" ");        
            
        System.out.println(wordsarray[n-1]);
         
    
    }
    
}
