package Day8;

public class one {
    public static void main(String[] args) {
        
        String str="WELCOME TO MV CLOUDS";
        String check=" ";
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=check.charAt(0)){ 
                sb.append(str.charAt(i));
            } 
        }
        System.out.println("Output: "+sb);
    }
    
}
