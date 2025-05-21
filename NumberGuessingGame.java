package com.nt.projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
public static void main(String[] args) {
	Random random=new Random();
	Scanner sc=new Scanner(System.in);
	
	int targetNumber=random.nextInt(100)+1;
	int maxAttempts=8;
	int attempts=0;
	
	System.out.println("Welcome to the Number Gussing Game!");
	System.out.println("I am thinking a number between  1 and 100,");
	System.out.println("You have"+maxAttempts+"attempts to guess it.");
	
	while(attempts<maxAttempts) {
		System.out.println("Enter your guess:");
		
		if(!sc.hasNextInt()) {
			System.out.println("Invalid input.please enter a number.");
			sc.next();
			continue;
		}
		int guess =sc.nextInt();
		attempts++;
		if(guess<1||guess>100) {
			System.out.println("please guess a number between 1 and 100");
			continue;
		}
		if(guess==targetNumber) {
			System.out.println("Congratulations! you guessed the numberin "+attempts+"attempts.");
			break;
		}
		else if(guess<targetNumber) {
			System.out.println("too low");
		}
		else
		{
			System.out.println("too high");
		}
		
		if(attempts==maxAttempts) {
			System.out.println("Sorry , you have used all the attempts. The number was :"+targetNumber);
			
		}
	}
	
	sc.close();
}
}
