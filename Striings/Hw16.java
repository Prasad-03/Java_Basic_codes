package Striings;

public class Hw16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123prasad123";
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			boolean b=Character.isDigit(c);
			if(b)
			{
				sum=sum+Character.getNumericValue(c);
			}
		}
		System.out.println(sum);	
	}

}
