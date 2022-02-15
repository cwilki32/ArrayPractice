package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Create a new project in IntelliJ named ArrayPractice
        // Initialize your project as a git repository and add/commit all changes as you work
        // Declare an array named dailyAverageTemp
        // Instruct the user to input daily average temperatures (in F) for 7 days
        // Each time the user inputs a value, add it to your dailyAverageTemp array


        double [] dailyAverageTemp = new double[7];
        Scanner userInput = new Scanner(System.in);

        for(int i = 0; i < dailyAverageTemp.length; i++) {
            System.out.println("Please input average temperature in Fahrenheit for day " + (i + 1) + ": ");
            dailyAverageTemp[i] = userInput.nextDouble();
        }
    }
}
