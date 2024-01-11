package Day8;

import java.util.Scanner;

public class sixteen {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of dice(Between 1 to 6): ");
        int numberOfDice = sc.nextInt();
        System.out.print("Enter the outcome you want: ");
        int outcome = sc.nextInt();
         

        int combinations = countCombinations(numberOfDice, outcome);
        System.out.println("Number of combinations: " + combinations);
    }
 
    static int countCombinations(int numberOfDice, int outcome) {
        if (numberOfDice < 1 || numberOfDice > 6 || outcome < numberOfDice || outcome > 6 * numberOfDice) {
             return 0;
        }

        return countCombinationsHelper(numberOfDice, outcome);
    }
 
    static int countCombinationsHelper(int numberOfDice, int outcome) { 
        if (numberOfDice == 0 && outcome == 0) {
            return 1;
        }
 
        if (numberOfDice == 0) {
            return 0;
        }

        int ways = 0;
 
        for (int i = 1; i <= 6; i++) {
            if (outcome - i >= 0) {
                ways += countCombinationsHelper(numberOfDice - 1, outcome - i);
            }
        }

        return ways;
    }
}
