package week1.day2;

import java.util.Iterator;
import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		Scanner K=new Scanner(System.in);
		System.out.println("Enter the Number");
		int version =K.nextInt();
		if(version<0)
		{
			System.out.println("Negative No");
		}
		else
		{
			System.out.println("Positive No");
		}
	}

}
