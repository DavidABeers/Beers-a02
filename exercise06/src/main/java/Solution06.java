/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */
/*
* print a prompt for the user to enter age
* print a prompt for the user to enter a retirement age
* subtract age from retirement age to get years left
* print years left until retirement
* use a library method to get the current year
* print the current year, add years left to print retirement year*/

import java.util.Scanner;
import java.time.Year;
public class Solution06 {
    static short getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextShort();
    }
    public static void main(String []args){
        short age = getUserInput("what is your current age?");
        short retirementAge = getUserInput("At what age do you want to retire?");
        int year = Year.now().getValue();
        int timeLeft = (retirementAge - age);
        System.out.printf("You have %d years left until you can retire %nIt's %d, so you can retire in %d%n", timeLeft, year, (year+timeLeft));
    }
}
