/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
*   prompt for and store user input for number of euros
*   prompt for and store input for exchange rate of euros to USD
*   use the exchange rate to convert from euros to USD
*   make an int value equal to the converted value*1000 (cast to int)
*   if the converted int value %100 is not zero
*       add .01 to the double value
*   print the result to 2 decimals*/

import java.util.Scanner;

public class Solution11 {
    private double getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextDouble();
    }
    public static void main(String []args){
        Solution11 exchange = new Solution11();
        double euros = exchange.getUserInput("Enter number of Euros");
        double exchangeRate = exchange.getUserInput("Enter the exchange rate");
        double USD = euros*exchangeRate;
        int rounding = (int)(USD*1000);
        if(rounding%100 != 0){
            USD += .01;
        }
        System.out.printf("%.2f Euros at the exchange rate %f is %n%.2f U.S. Dollars.", euros, exchangeRate, USD);
    }
}
