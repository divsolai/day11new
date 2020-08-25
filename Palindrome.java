package java30;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input;
		String rev="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input");
		input=scan.nextLine();
		int size=input.length();
		for(int i=size-1;i>=0;i--)
	{
		//System.out.print(input.charAt(i))
		rev= rev+ input.charAt(i);
		
	}
		if(input.equals(rev))
		{
			System.out.println("The given string is an palindrome");
		}
		else
		{
			System.out.println("The given string is not an palindrome");
		}
		scan.close();

}
}
