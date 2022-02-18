package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world, and TGIF!");
        //Assigning variables (doubles)
        double radius = 0;
        double area = 0;
        //Assign a radius
        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius: ");
        radius = input.nextDouble();        //Compute area

        area = radius * radius * 3.14159;
        //Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    } //main
} //Main
