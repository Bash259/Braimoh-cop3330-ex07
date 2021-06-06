/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Do you want to enter your values in feet or in meters?\nFeet\nMeters");
        Scanner UserInput = new Scanner(System.in);
        String Answer = UserInput.nextLine();
        if (Answer.equals("Feet")) {
            System.out.println("What is the length of the room in feet?");
            Scanner Numbers = new Scanner(System.in);
            int Length = Numbers.nextInt();
            System.out.println("What is the width of the room in feet?");
            int Width = Numbers.nextInt();
            System.out.println("You entered the dimensions of " + Length + " feet by " + Width + " feet.");
            int Area = Length * Width;
            System.out.println("The area is\n" + Area + " square feet.");
            double AreaMeters = Area * 0.09290304;
            System.out.println(AreaMeters + " square Meters.");
        } else if(Answer.equals("Meters")){
            System.out.println("What is the length of the room in meters?");
            Scanner Numbers = new Scanner(System.in);
            int Length = Numbers.nextInt();
            System.out.println("What is the width of the room in meters?");
            int Width = Numbers.nextInt();
            System.out.println("You entered the dimensions of " + Length + " meters by " + Width + " meters.");
            int Area = Length * Width;
            System.out.println("The area is\n" + Area + " square meters.");
            double AreaFeet = Area / 0.09290304;
            System.out.println(AreaFeet + " square feet.");
        }
    }
}