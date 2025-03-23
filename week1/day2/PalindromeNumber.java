package week1.day2;

import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the input: ");
			int n=obj.nextInt();
			int input, output,reverse=0;
			input=n;
			while(input!=0)
			{
				 output=input%10;
				 reverse=reverse*10+output;
				 input/=10;
			}
			
			if(n==reverse)
			{
				System.out.println("It is Palindrome");
			}
			else
			{
				System.out.println("It is not Palindrome");
			}

	}

}
