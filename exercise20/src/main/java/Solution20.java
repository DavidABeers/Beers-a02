/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
*   prompt for and store an order amount
*   prompt for and store the state
*   if state = WI
*       tax = .05
*       prompt for and store county
*       if county = Eau Claire
*           tax = tax + .005
*       if county = Dunn
*           tax = tax + .004
*   if state = IL
*       tax = .08
*   round
*   print results*/

import java.util.Scanner;

public class Solution20 {
    private String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
    private float getTax(){
        float tax = 0;
        String state = this.getUserInput("Enter state abbreviation");
        if(state.equals("WI")){
            tax += .05;
            String county = this.getUserInput("Which county in Wisconsin?");
            if(county.equals("Eau Claire")){
                tax += .005;
            }
            else if(county.equals("Dunn")){
                tax += .004;
            }
        }
        else if(state.equals("IL")){
            tax += .08;
        }
        return tax;
    }
    public double round(double amount){
        int checkRounding = (int)(amount * 1000);
        if(checkRounding%100 != 0){
            amount+=.01;
        }
        return amount;
    }

    public static void main(String []args){
        Solution20 app = new Solution20();
        double amount = Double.parseDouble(app.getUserInput("Enter order amount:"));
        float tax = app.getTax();
        double total = app.round((amount+tax));
        tax = (float)app.round(tax);
        System.out.printf("The Tax is $%.2f%nThe total is $%.2f", tax, total);
    }
}
