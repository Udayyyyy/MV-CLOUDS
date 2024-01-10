package Day7;

public class fourteen {
    public static void main(String[] args) {
        int key=6;
        String str="ABC";
        StringBuilder dstr=new StringBuilder();
        StringBuilder estr=new StringBuilder();        
        System.out.println("Original Message : "+str);
        System.out.println();
        char [] chars=str.toCharArray();

        for(char c:chars){
            if(c%2==0){c+=2*key;}
            else{c-=3*key;}
            
        dstr.append(c); 

        }
        String dsstr=dstr.toString();

        System.out.println("Encrypted msg:  "+dsstr);
        System.out.println();
        
         char [] dchars=dsstr.toCharArray();

          for(char c:dchars){
            if(c%2==0){c-=2*key;}
            else{c+=3*key;}
             
 
        estr.append(c);

        }
        System.out.println("Decrypted msg:  "+estr);
    }


    
}
