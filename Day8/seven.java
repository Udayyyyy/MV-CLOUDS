package Day8;
import java.util.Scanner;

public class seven {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the pattern: ");
        int size = sc.nextInt();
 
      for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                 if((i==1)||j==1||j==size||i==size){
                    System.out.print("*");
                 }
                 else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
            
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                 if(j==1||(j==size&&i%2!=0)||j==size||i==size){
                    System.out.print("*");
                 }
                 else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
            
        }
        
        sc.close();
    }
}

// package Day8;
// import java.util.Scanner;

// public class seven {

//     public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the pattern: ");
//         int size = sc.nextInt();
 
//       for (int i = 1; i <= size; i++) {
//         if(i==1||i==size){
//             System.out.print(" ");
//         }
//         else{
//             System.out.print("*");
//         }
        
//       }
//       System.out.println();
      
//             for (int i = 1; i <= size; i++) {
//                 for (int j = 1; i <= size; i++) {
//                     if(j==size||j==1){
//                     System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");
//                         }
//                 }
//             System.out.println();
//         }

        
//         sc.close();
//     }
// }
