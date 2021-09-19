/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Beers
 */

/*
  make method getUserInput to return an entered short
  while(input invalid)
      Try:
        * getUserInput for male or female
        * getUserInput for ounces of alcohol
        * getUserInput for body weight in pounds
        * getUserInput for hours since drinking
      Catch:
          input must be a number
* calculate BAC estimate
* print the result*/

import java.util.Scanner;

public class Solution17 {
    private short getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextShort();
    }
    public short getSex(){
        short sex=0;
        while(sex!=1 && sex != 2){
            try{
                sex = this.getUserInput("Enter 1 for male, 2 for female:");
            }
            catch (Exception e){
                System.out.println("Input must be either 1 or 2");
            }
            if(sex!=1 && sex!=2){
                System.out.println("Input must be either 1 or 2");
            }
        }
        return sex;
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

    public static void main(String []args){
        Solution17 app = new Solution17();
        float ratio = (float)0.66;
        short sex = app.getSex();
        short oz = app.getGenericNumber("Enter ounces of alcohol consumed:");
        short weight = app.getGenericNumber("Enter body weight in pounds:");
        short hours = app.getGenericNumber("Enter hours since consumption:");
        if(sex == 1) ratio = (float) 0.73;
        float bac = (float)((oz * 5.14/weight * ratio) - (0.015 * hours));
        if(bac<0) bac = 0;
        if(bac > 0.08){
            System.out.printf("Your BAC is %f%nIt is not legal for you to drive.", bac);
        }
        else{
            System.out.printf("Your BAC is %f%nIt is legal for you to drive.", bac);
        }
    }
}
