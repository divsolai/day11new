package java30;

import java.util.Scanner;

public class Palindrome2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input");
		input=scan.nextLine();
		if(checkPal(input))
		{
			System.out.println("the entered string is an palindrome");
		}
		else
		{
			System.out.println("The entered string is not an palindrome");
		}
			
		scan.close();
	}

	private static boolean checkPal(String s) {
		// TODO Auto-generated method stub
		if(s.length()==0||s.length()==1)
		{
		return true;
	}
		else
		{
			if(s.charAt(0) == s.charAt(s.length()-1))
			{
				return checkPal(s.substring(1, s.length()-1));
			}
		}
		return false;
	}
}

	