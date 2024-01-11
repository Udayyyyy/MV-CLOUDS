package Day8;

import java.util.Collection;

public class twelve {
    public static void main(String[] args) {
        String str="My name is uday"; 
         String[] splitedwords=str.split(" ");
         for(int i=splitedwords.length;i>0;i--){
            System.out.print(splitedwords[i-1]+" ");

         }
    }
    
}
