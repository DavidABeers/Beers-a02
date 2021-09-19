/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

import java.util.Scanner;

/*
* print prompt to convert to either Fahrenheit or Celsius
* if input is c or C
*   convert from Fahrenheit to Celsius
* else
*   convert from Celsius to Fahrenheit
* prompt for temperature to convert from
* print the converted temperature */
public class Solution18 {
    private String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.next();
    }
    public static void main(String []args) {
        Solution18 app = new Solution18();
        String toTemp = "";
        int convertedTemp = 0;
        String choice = app.getUserInput("Press C to convert Fahrenheit to Celsius.\nPress F to convert Celsius to Fahrenheit.");
        if (choice.equals("c") || choice.equals("C")) {
            toTemp = "Celsius";
            int tempF = Integer.parseInt(app.getUserInput("Your choice: C\nEnter temperature in Fahrenheit:"));
            convertedTemp = ((tempF-32) * 5 / 9);
        }
        else if(choice.equals("f") || choice.equals("F")){
            toTemp = "Fahrenheit";
            int tempC = Integer.parseInt(app.getUserInput("Your choice: F\nEnter temperature in Celsius:"));
            convertedTemp = (tempC*9/5) + 32;
        }
        System.out.printf("The temperature in %s is %d", toTemp, convertedTemp);
    }
}
