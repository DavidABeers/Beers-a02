/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
prompt for and store the number of the month
check the number against a switch statement to select the month
print the name of the month that corresponds with the number
 */
import java.util.Scanner;

public class Solution21 {
    private short getUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the month:");
        return input.nextShort();
    }
    private String getMonth(short monthNum){
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }
    public static void main(String[] args) {
        Solution21 app = new Solution21();
        short monthNum = app.getUserInput();
        System.out.printf("The name of the month is %s.%n", app.getMonth(monthNum));
    }
}
