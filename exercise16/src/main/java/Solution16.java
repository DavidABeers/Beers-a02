/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
* prompt for and store user age
* use a ternary operator to test if the age is 16 or over
* print the appropriate result*/

import java.util.Scanner;

public class Solution16 {
 // (Age >= 16) ? "You are old enough to legally drive" : "You are not old enough to legally drive";

    private short getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextShort();
    }
    public static void main(String []args){
        Solution16 app = new Solution16();
        short age = app.getUserInput("What is your age?");
        System.out.printf("%s%n", ((age >= 16) ? "You are old enough to legally drive" : "You are not old enough to legally drive"));
    }
}
