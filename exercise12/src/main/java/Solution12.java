/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
*   prompt for and store the investment amount
*   prompt for and store the interest rate as a percent
    prompt for and store the investment period
    calculate value after interest A = P(1 + rt)
    multiply value by 1000 to check for fractions of cents and round
    print the results
 */

import java.util.Scanner;

public class Solution12 {
    private String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
    private double round(double finalValue){
        int checkRounding = (int)(finalValue*1000);
        if(checkRounding%100 != 0){
            finalValue += .01;
        }
        return  finalValue;
    }
    public static void main(String []args){
        Solution12 app = new Solution12();
        double principal = Double.parseDouble(app.getUserInput("Enter initial amount:"));
        float rate = ((Float.parseFloat(app.getUserInput("Enter interest rate:"))) / 100) ;
        int period = Integer.parseInt(app.getUserInput("Enter number of years:"));
        double finalValue = (principal * (1 + (rate * period)));
        finalValue = app.round(finalValue);
        System.out.printf("After %d years at %.1f percent, the investment will be worth $%.2f", period, (rate*100), finalValue);
    }
}
