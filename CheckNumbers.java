package week1.day2.assignment5;

import java.util.Scanner;

// Bullet 5 and 6

public class CheckNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		// Bullet 5
		System.out.println("Enter an integer and I'll tell you if it's prime");
		int entry = in.nextInt();
		
		if (isPrime(entry))
			System.out.println("It's prime \n");
		else
			System.out.println("It's not prime \n");
		
		// Bullet 6
		System.out.println("Enter an integer and I'll tell you if it's a palindrome (yes, an integer");
		entry = in.nextInt();
		if (isPalindrome(entry))
			System.out.println("It's a palindrome");
		else
			System.out.println("It's not a palindrome");
		
		in.close();
	}
	
	private static boolean isPalindrome(int entry) {
		String s = Integer.toString(entry);

		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		
		return true;
	}

	private static boolean isPrime(int entry) {
		for (int i = 2; i < entry; i++)
			if (entry % i == 0)
				return false;
		
		if (entry == 1)
			return false;
		
		return true;
	}
}
