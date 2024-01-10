package Day7;

import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number: ");
         float n=sc.nextFloat();
         StringBuilder ns = new StringBuilder(Float.toString(n)).reverse();

         System.out.println(ns);

    }
    
}
    