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
        int num1;
        int num2;
        int count;

        do{
            num1 = scan.nextInt();
            num2 = scan.nextInt();

        }while(num1 != 0 && num2 != 0);
    }
}
