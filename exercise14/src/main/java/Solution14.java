/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
*   prompt for and store the order amount from the user
*   prompt for and store the state entered by the user
*   if input is WI:
*       tax = .055 * amount;
*       subtotal = amount + tax;
*       print subtotal;
*       print tax;
*       total = total + tax;
*   print total
 */

import java.util.Scanner;

public class Solution14 {
    private String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }

    public static void main(String []args){
        Solution14 app = new Solution14();
        double amount = Double.parseDouble(app.getUserInput("Enter order amount:"));
        double total = amount;
        if(app.getUserInput("Enter state abbreviation").equals("WI")){
            float tax = (float)(amount*.055);
            total = amount+tax;
            System.out.printf("The subtotal is $%.2f%nThe Tax is $%.2f%n", amount, tax);
        }
        System.out.printf("The total is $%.2f", total);
    }
}
