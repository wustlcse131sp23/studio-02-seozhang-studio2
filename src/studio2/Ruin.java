package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your start amount?");
		int startAmount = in.nextInt();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		
		
		System.out.println("What is your total simulations?");
		int totalSimulations = in.nextInt();
		
		for (int count = 1; count <= totalSimulations; count++)
		{
			while (startAmount < winLimit && startAmount >= 0)
		{
			System.out.println(startAmount);
		
			if (winChance > Math.random())

			{
				System.out.println("win");
				startAmount ++ ;
				
			}
				
			else 
				
			{
				System.out.println("ruin");
				startAmount --;
				
			}
		}
				
			}
		}
	}

