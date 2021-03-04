package Striings;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// Without method
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index no:\n");
		int x=sc.nextInt();
		String s="Prasad";
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[x]);
			break;
		}

		//With Method
		char c=s.charAt(x);;
		System.out.println(c);
	}

}
