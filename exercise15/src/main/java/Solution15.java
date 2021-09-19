/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

import java.util.Scanner;

/*
    make an instance called "user" which stores a username and password
    prompt for and store username from the user
*   prompt for and store password from the user
    compare just the password to the only user object since the example output and question doesn't specify a username
    if enteredPassword is the same as user.getPassword,
        print "welcome"
    else
        print "I don't know you"
*   */
public class Solution15 {
    private String username;
    private String password;

    private Solution15(){
        String username;
        String password;
    }
    private Solution15(String user, String pass){
        username = user;
        password = pass;
    }
    private String getPassword() {
        return password;
    }
    private String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
    public static void main(String []args){
        Solution15 user = new Solution15("David", "abc$123");
        String enteredUsername = user.getUserInput("Username:");
        String enteredPassword = user.getUserInput("Password:");
        if(enteredPassword.equals(user.getPassword())){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }

    }
}
