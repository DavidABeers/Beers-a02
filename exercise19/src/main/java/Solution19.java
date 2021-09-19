/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*  make method getUserInput that prompts for and stores a short
    make method getGenericNumber that ensures getUserInput returns a valid number
    call getGenericNumber prompting for weight
    call getGenericNumber prompting for height
    calculate bmi and print result to 1 decimal
 */

import java.util.Scanner;

public class Solution19 {
    private short getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextShort();
    }
    public short getGenericNumber(String prompt){
        short num=-1;
        while(num<0){
            try{
                num = this.getUserInput(prompt);
            }
            catch (Exception e){
                System.out.println("Input must be a number");
            }
        }
        return num;
    }
    private static void printBMI(float bmi){
        if(bmi<18.5){
            System.out.printf("your BMI is %.1f.%nYou are underweight, you should see your doctor", bmi);
        }
        else if(bmi >= 18.5 && bmi <= 25){
            System.out.printf("your BMI is %.1f.%nYour weight is within the ideal range for your height", bmi);
        }
        else{
            System.out.printf("your BMI is %.1f.%nYou are overweight, you should see your doctor", bmi);
        }
    }
    public static void main(String []args){
        Solution19 app = new Solution19();
        short weight = app.getGenericNumber("Enter your weight in pounds:");
        short height = app.getGenericNumber("Enter your height in inches:");
        float bmi = (float)(weight)/(height*height) * 703;
        printBMI(bmi);
    }
}
