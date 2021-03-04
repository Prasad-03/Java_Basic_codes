package Striings;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first name:\n");
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		String s2=sb.toString();
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}
		
	}

}
