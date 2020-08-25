package java30;

import java.util.Arrays;
import java.util.Scanner;

public class DupCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the input string");
	    input=scan.nextLine();	
	    String input1="";
	    char[] charArray = input.toCharArray();
	    //System.out.println(Arrays.toString(charArray));
	    for(int i=0;i<input.length();i++)
	    {
	    	for(int j=i+1;j<input.length();j++)
	    	{
	    		if(charArray[i]==charArray[j])
	    		{
	    			input1=input1+charArray[i];
	    			
	    		}
	    	}
	    }
	    
	    System.out.println(input1);
	}

}
