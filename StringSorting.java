package java30;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		input = scan.nextLine();
		String[] split = input.split(" ");
		Arrays.sort(split);
		//System.out.println(Arrays.toString(split));
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i] + " ");
			scan.close();
		}
	}
}
