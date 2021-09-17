/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/* PSEUDOCODE
    create method getUserInput to prompt for and store user input
    create method calculateGallonsOfPaintNeeded
        multiply length and width for area
        test for remainder with area%350
        if remainder is 0,
            gallonsNeeded = area/350;
        if is more than 0,
            gallonsNeeded = area/350 + 1
    call getUserInput to store length
    call getUserInput to store width
    call calculateGallonsOfPaintNeeded and print the result
 */

import java.util.Scanner;
public class Solution09 {
    private float getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextFloat();
    }
    private short calculateGallonsOfPaintNeeded(float length, float width){
        final short CONVERSION = 350;
        short gallonsNeeded = 0;
        if((length*width)%CONVERSION == 0){
            gallonsNeeded = (short)((length*width)/CONVERSION);
        }
        else{
            gallonsNeeded = (short)((length*width)/CONVERSION + 1);
        }
        return gallonsNeeded;
    }
    public static void main(String []args){
        Solution09 paint = new Solution09();
        float length = paint.getUserInput("Length of ceiling in feet:");
        float width = paint.getUserInput("Width of ceiling in feet:");
        System.out.printf("You will need %d gallons of paint for %.3f square feet", paint.calculateGallonsOfPaintNeeded(length, width), (length*width));
    }
}
