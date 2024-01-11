package Day8;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collection;

public class two {
    public static void main(String[] args) {

        ArrayList<Character> clist=new ArrayList<Character>();
        clist.add('x');
        clist.add('b');
        clist.add('g');
        clist.add('a');
        System.out.println("Original List: "+clist);
        clist.sort(null);
        System.out.println("Sorted List: "+clist);
        
    }
    
}
