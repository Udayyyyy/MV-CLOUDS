package Day7;

public class thirteen {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();

        sb.append("Hey, what's your plan for Utarayan?");
        System.out.println(sb);
 
        sb.setLength(0);
        System.out.println(sb);


        
        sb.append("No plans Right now");
        System.out.println(sb);
 
        sb.delete(0,sb.length());
        System.out.println(sb);
        


        sb.append("Ohh, Sad emoji");
        System.out.println(sb);

        sb=new StringBuilder();
        System.out.println(sb);
}
    
}
