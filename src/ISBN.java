/**
 * Program Name: ISBN Validation
 * Purpose: Checks International Standard Book Numbers
 * to make sure they are valid
 * Coder: Brian Hache SN# 0909940
 * Date: Feb 6, 2019
 */
import java.util.Scanner;
public class ISBN {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;

        System.out.println("Please Enter the ISBN:");
        String isbn = stdin.nextLine();

        for(int i = 0; i < isbn.length(); i++){
            char charNum = isbn.charAt(i);
            boolean isValidNum = ((charNum >= 48 && charNum <= 57) || charNum == 'X');

            if(!isValidNum){
                continue;
            }else{
                if(charNum >= 48 && charNum <= 57){
                    int num = charNum - '0';
                    s1 += num;
                    s2 += s1;
                }else if(charNum == 'X'){
                    s1 += 10;
                    s2 += s1;
                }
            }

        }
        if(s2 % 11 == 0 && s2 > 0){
            System.out.println(isbn + " is correct.");
        }else{
            System.out.println(isbn + " is incorrect");
        }
        System.out.println("S1: " + s1 + " S2: " + s2);
    }
}
