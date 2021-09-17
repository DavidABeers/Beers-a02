/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
* make method getUserInput that prompts for and collects user input
* call getUserInput for number of people and store the value numPeople
* call getUserInput for number of pizzas and store the value numPizzas
* call getUserInput for slices per pizza and store as slicesPerPizza
* multiply slicesPerPizza by numPizzas for totalSlices
* use modulo to get remainder of totalSlices/numPeople and store as leftovers
* subtract leftovers from totalSlices for slicesTaken
* divide slicesTaken by numPeople for slicesPerPerson
* Print slicesPerPerson and leftovers
* */

import java.util.Scanner;

public class Solution08 {
    private short getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextShort();
    }
    public static void main(String []args){
        Solution08 party = new Solution08();
        short numPeople = party.getUserInput("Enter number of people");
        short numPizzas = party.getUserInput("Enter number of pizzas");
        short slicesPerPizza = party.getUserInput("Enter slices per pizza");
        short totalSlices = (short)(numPizzas * slicesPerPizza);
        short leftovers = (short)(totalSlices%numPeople);
        System.out.printf("Each person gets %d piece(s) of pizza%nThere are %d piece(s) leftover", ((totalSlices-leftovers)/numPeople), leftovers);
    }
}
