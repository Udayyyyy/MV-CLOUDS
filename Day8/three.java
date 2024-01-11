package Day8;

import java.util.ArrayList; 

public class three {
    public static void main(String[] args) {
        ArrayList<Integer> ilist=new ArrayList<Integer>();
        ilist.add(99);
        ilist.add(9);
        ilist.add(39);
        ilist.add(23);
        ilist.add(14);
        ilist.add(2);
        ilist.add(50);
        System.out.println("Original list: "+ilist);
        ilist.sort(null);
        System.out.println(ilist);
        System.out.println(ilist.get(ilist.size()-2));
        
    }
    
}
