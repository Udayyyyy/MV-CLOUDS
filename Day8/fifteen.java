package Day8;

import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check armstrong:");
        Integer num =sc.nextInt();
        Integer temp=num;
        int finalnum=0;
        int power=num.toString().length();
        while (num!=0){
            int digit=num%10;
            finalnum+=Math.pow(digit, power); 
            num/=10;
        }        
        if (finalnum==temp){
            System.out.println(temp+ " is an Armstrong number.");
            }else{
                System.out.println(temp+" is not an Armstrong number.");
                }
    }
}
    

