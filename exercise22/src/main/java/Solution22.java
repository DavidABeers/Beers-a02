/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
    prompt for and store number 1 in array
    prompt for and store number 2 in array
    prompt for and store number 3 in array
    if num1 != num2 & num1!= num3 & num2!= num3
        biggest = num1
        for loop
            if ary[i-1]>biggest-
                biggest = ary i-1
    print biggest
 */

import java.util.Scanner;

public class Solution22 {
    private int getUserInput(int i){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number %d", i);
        return input.nextInt();
    }
    public static void main(String []args){
        Solution22 app = new Solution22();
        int[] numArray = new int[3];
        for(int i = 0;i<3;i++){
            numArray[i] = app.getUserInput((i+1));
        }
        if(numArray[0] != numArray[1] && numArray[0] != numArray[2] && numArray[1] != numArray[2]){
            int biggest = numArray[0];
            for(int i = 1;i<3;i++){
                if(biggest<numArray[i]){
                    biggest = numArray[i];
                }
            }
            System.out.printf("The largest number is %d.%n", biggest);
        }
    }
}
