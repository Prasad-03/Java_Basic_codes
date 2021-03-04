package Striings;

import java.util.Arrays;

public class Hw19 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="prasadbabar";
		char []c=s.toCharArray();
		
		
		int x[]=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j]&&c[i]!='@')
				{
					count++;
					c[j]='@';
				}
			}
			x[i]=count;
			if(x[i]<=count)
				x[i]=count;
		
			for(int k=0;k<x.length;k++)
			{
				System.out.println(x[k]);
			}
			
			
		}
		
	}

}
