package Day7;

public class fourteen {
    public static void main(String[] args) {
        int key=6;
        String str="Hey, I want to encrypt this msg";
        StringBuilder dstr=new StringBuilder();
        StringBuilder estr=new StringBuilder();        
        System.out.println("Original Message : "+str);
        System.out.println();
        char [] chars=str.toCharArray();

        for(char c:chars){
            c+=key;
        dstr.append(c); 

        }
        String dsstr=dstr.toString();

        System.out.println("Encrypted msg:  "+dsstr);
        System.out.println();
        
         char [] dchars=dsstr.toCharArray();

          for(char c:dchars){
            c-=key;
 
        estr.append(c);

        }
        System.out.println("Decrypted msg:  "+estr);
    }


    
}
