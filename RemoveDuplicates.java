package week1.day2.assignment5;

import java.util.Scanner;

// Bullet 8

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Gimme a string");
		
		String userString = new String(in.next());
		
		System.out.println(removeDuplicates(userString));
		
		in.close();
	}

	private static String removeDuplicates(String userString) {
		String foundChars = "";
		String finishedString = "";
		
		for (int i = 0; i < userString.length(); i++) {
			String it = "" + userString.charAt(i);
			if (!foundChars.contains(it)) {
				finishedString += it;
				foundChars += it;
			}
		}
		return finishedString;
	}
}
