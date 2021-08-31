import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static double gal_conversion = 350;

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is the length of the ceiling?" );
        double length = input.nextDouble();;
        System.out.println(" What is the width of the ceiling? ");
        double width = input.nextDouble();

        double area = length*width;
        double gal_needed = Math.ceil(area/gal_conversion);

        System.out.println(" You will need " + gal_needed + " gallons of paint " + "to cover " + area + " square feet ");

    }
}
