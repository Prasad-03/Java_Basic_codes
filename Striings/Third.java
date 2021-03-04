package Striings;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		//Witout method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:\n");
		String s1=sc.next();
		System.out.println("enter second name:\n");
		String s2=sc.next();
		
		if(s1.length()>s2.length())
		{
			System.err.println("positive");
		}
		else if(s1.length()<s2.length())
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("lexicographically");
		}
		
		//with method
		System.err.println(s1.compareTo(s2));
		
		//if string length> string 2 it gives positive else if it less than then it give negative else give 0;
	}

}
