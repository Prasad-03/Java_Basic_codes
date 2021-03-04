package Striings;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// Without method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:\n");
		String s1=sc.next();
		char c[]= {'p','r','a','s','a','d'};
		char ch[]=s1.toCharArray();
		int count=0;
		if(c.length==ch.length)
		{
			for(int i=0;i<c.length;i++)
			{
				//System.out.println(ch[i]);
				if(c[i]==ch[i])
				{
					count++;
				}
			}
		}
		if(ch.length==count)
		{
			System.out.println("both are equal characters");
		}
		else
		{
			System.out.println("not equal");
		}
		//with method
		String s=String.valueOf(ch);
		if(s.equals(s1))
		{
			
			System.out.println("both are equal characters");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}

}
