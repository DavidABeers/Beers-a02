/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
 * print a prompt for the length of the room in feet
 * store the length
 * print a prompt for the width of the room in feet
 * store the width
 * multiply the length by the width and store the product
 * create another variable to store the area in meters, convert from square feet
 * print the area in feet and maters
 * */

import java.util.Scanner;
public class Solution07 {
    private static float getDistance(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        float length = input.nextFloat();
        input.close();
        return length;
    }

    public static void main(String []args){
        final double CONVERSION = 0.09290304;
        float length = getDistance("Enter length of the room in feet");
        float width = getDistance("Enter width of the room in feet");
        float areaFeet = length * width;
        double areaMeters = areaFeet * CONVERSION;
        System.out.printf("Area of the room is%n%.3f square feet%n%.3f square meters", areaFeet, areaMeters);
    }
}
