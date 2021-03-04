package Striings;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// Without method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:\n");
		String s1=sc.next();
		System.out.println("enter second name:\n");
		String s2=sc.next();
		
		System.err.println(s1+" "+s2);
		
		//with method
		System.out.println(s1.concat(s2));

	}

}
