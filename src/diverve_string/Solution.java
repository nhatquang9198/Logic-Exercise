package diverve_string;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int a, b, c;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A, B, C number of a, b, c character: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		System.out.println(solution(a, b, c));

		scanner.close();

	}

	public static String solution(int a, int b, int c) {
		if (a == 0 && b == 0 || a == 0 && c == 0 || b == 0 && c == 0) {
			return "";
		} else {
			String s = "";
			s = s + generateString(a, "a");
			s = s + generateString(b, "b");
			s = s + generateString(c, "c");

			return s;
		}
	}

	public static String generateString(int length, String s) {
		String string = "";

		for (int i = 0; i < length; i++) {
			string = string + s;
		}

		return string;
	}

}
