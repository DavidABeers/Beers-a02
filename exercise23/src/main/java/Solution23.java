/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
    if car is silent
        if battery terminals corroded
            clean battery terminals
        else
            replace cables
    else
        if car makes slicking noise
            replace battery
        else
            if car cranks up but fails to start
                if engine is fuel injected
                    get car serviced
                else
                    check choke
            else
                can't help
 */
import java.util.Scanner;

public class Solution23 {
    private String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.next();
    }
    private void engineCheck(){

        if(this.getUserInput("Is the car silent when you turn the key?").equals("y")){
            if(this.getUserInput("Are the battery terminals corroded?").equals("y")){
                System.out.println("Clean the battery terminals and try again.");
            }
            else{
                System.out.println("Replace the cables and try again.");
            }
        }
        else {
            if(this.getUserInput("Does the car make a slicking noise?").equals("y")){
                System.out.println("Replace the battery.");
            }
            else{
                if(this.getUserInput("Does the car crank up but fail to start?)").equals("y")){
                    System.out.println("Check the spark plug connections.");
                }
                else{
                    if(this.getUserInput("Does the engine start and then die?)").equals("y")){
                        if(this.getUserInput("Does the car have fuel injection?)").equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.println("Shouldn't be possible, get a new car.");
                    }
                }
            }
        }
    }
    public static void main(String []args){
        Solution23 app = new Solution23();
        app.engineCheck();
    }
}
