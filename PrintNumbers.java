package week1.day2.assignment5;

import java.util.Scanner;

// Bullet 3 and 4

public class PrintNumbers {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++)
			if (i % 2 == 0)
				System.out.print(Integer.toString(i) + " ");
		
		int start;
		int number;
		System.out.println("\nPlease enter number of odd numbers to print, then starting point");
		
		Scanner in = new Scanner (System.in);
		number = in.nextInt();
		start = in.nextInt();
		
		for (int i = start; i < start + number*2; i++)	// This is inefficient, should check oddness then do i+=2
			if (i % 2 == 1)
				System.out.print(Integer.toString(i) + " ");
		
		in.close();
	}
}
