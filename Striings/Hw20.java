package Striings;

public class Hw20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="prasad";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&s.charAt(i)!='@')
				{
					String d=Character.toString(s.charAt(i));
					s=s.replaceAll(d, "");
					//System.out.println(s.replace(s.charAt(i), ));
					System.out.println(s);
					
				}
			}
		}

	}

}
