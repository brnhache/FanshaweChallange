import java.util.Scanner;

/**
 * Program Name: Primary Arithmetic
 * Purpose: counts the number of possible carry-overs for children practicing addition
 * Coder: Brian Hache SN# 0909940
 * Date: 2019-02-27
 */

public class PrimaryArithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;


        while(num1 != 0 && num2 != 0){
            int count = 0;
            num1 = scan.nextInt();
            num2 = scan.nextInt();

            if (num1 == 0 && num2 == 0){
                break;
            }

            int small = Math.min(num1, num2);
            int big = Math.max(num1, num2);

            while(small > 0){
                int num1digit = small % 10;
                int num2digit = big % 10;
                small /= 10;
                big /= 10;
                if(num1digit + num2digit >= 10){
                    count ++;
                }

            }
            if (count == 0){
                System.out.println("No carry operation.");
            }else if(count == 1){
                System.out.println("1 carry operation.");
            }else{
                System.out.println(count + " carry operations.");
            }

        }
    }
}
