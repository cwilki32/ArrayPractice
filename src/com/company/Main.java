package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Create a new project in IntelliJ named ArrayPractice
        // Initialize your project as a git repository and add/commit all changes as you work
        // Declare an array named dailyAverageTemp
        // Instruct the user to input daily average temperatures (in F) for 7 days
        // Commit 1 Each time the user inputs a value, add it to your dailyAverageTemp array
        // Commit 2 Write a program that loops through your array and prints out each daily average temp
        // Commit 3 Write a program that prints out the weekly average temperature


        double [] dailyAverageTemp = new double[7];
        Scanner userInput = new Scanner(System.in);
        int temp, sum = 0;
        float average;

        for(int i = 0; i < dailyAverageTemp.length; i++) {
            System.out.println("Please input average temperature in Fahrenheit for day " + (i + 1) + ": ");
            dailyAverageTemp[i] = userInput.nextInt();
            sum += dailyAverageTemp[i];
        }
        average = (float)sum/7;
        System.out.println("The temperatures inputed were as follows: " + Arrays.toString(dailyAverageTemp));
        System.out.println("The average for the week is: " + average + " degrees.");
    }
}
