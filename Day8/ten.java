package Day8;

import java.util.Scanner;

public class ten {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
         

        for(int i=1;i<=n;i++){

              for(int j=1;j<=n-i;j++){
 
                    System.out.print(" ");
                }

            for(int j=1;j<=(2*i-1);j++){
                    if(j%2==0){
                    System.out.print(i-1);
                    }
                    else{
                        System.out.print("*");
                    }
                } 
 
            System.out.println();
            }

            
    
 
        } 
}
