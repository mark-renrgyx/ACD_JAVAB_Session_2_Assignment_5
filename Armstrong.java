package week1.day2.assignment5;

import java.util.Scanner;

// Bullet 7

public class Armstrong {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter a number, to see if it's Armstrong");
		int number = in.nextInt();
		
		if (isArmstrong(number))
			System.out.println("It's an Armstrong number");
		else
			System.out.println(("It's not an Armstrong number"));
		
		in.close();
	}

	private static boolean isArmstrong(int number) {
		
		String s = Integer.toString(number);	// String.valueOf() is another option ... exact same behavior
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			String digitString = "" + s.charAt(i);
			int digit = Integer.parseInt(digitString);
			sum += Math.pow(digit, 3);
		}
		if (sum == number)
			return true;
		
		return false;
	}
}
