/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

import java.util.Scanner;

/* PSEUDOCODE
*   create getUserInput method to prompt for and store data
*   call getUserInput for the 3 items and their prices
*   create a method to calculate and return the subtotal
*   create a method to calculate and return tax
*   find total.
*   print the subtotal, tax, and total on separate lines
*   */
public class Solution10 {
    private String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
    private double findSubtotal(float price1, int num1, float price2, int num2, float price3, int num3){
        return ((price1*num1) + (price2*num2) + (price3*num3));
    }
    private double findTax(double subtotal){
        return subtotal*.055;
    }
    public static void main(String []args){
        Solution10 checkout = new Solution10();
        float item1Price = Float.parseFloat(checkout.getUserInput("Price of item 1:"));
        int item1Quantity = Integer.parseInt(checkout.getUserInput("Quantity of Item 1:"));
        float item2Price = Float.parseFloat(checkout.getUserInput("Price of item 2:"));
        int item2Quantity = Integer.parseInt(checkout.getUserInput("Quantity of Item 2:"));
        float item3Price = Float.parseFloat(checkout.getUserInput("Price of item 3:"));
        int item3Quantity = Integer.parseInt(checkout.getUserInput("Quantity of Item 3:"));
        double subtotal = checkout.findSubtotal(item1Price, item1Quantity, item2Price, item2Quantity, item2Price, item3Quantity);
        double tax = checkout.findTax(subtotal);
        double total = tax+subtotal;
        System.out.printf("Subtotal: %.2f%nTax: %.2f%nTotal: %.2f", subtotal, tax, total);
    }
}
