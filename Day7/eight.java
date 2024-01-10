package Day7;
import java.util.*;

public class eight {
    public static void main(String [] args)
    {
        int count=0;
        List <Integer> oddnumberlist =new ArrayList<Integer>();
        oddnumberlist.addAll(Arrays.asList(1,7,1,19,23,27,29,33,123));
        for (int i=0 ;i<oddnumberlist.size();i++){
            if((oddnumberlist.get(i)%2==0)){
                count+=1;
               
            } 
    } 
    if(count==0){
        System.out.println("List contains only odd numbers");
    }
        else{
            
        System.out.println("List contains even numbers also");
        }
    }

    

    
}
    

