package Striings;

public class Hw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="prasad";
		String b="sabar";
		//System.out.println(b.charAt(0));
		char ch[]=s.toCharArray();
		for(int i =0;i<s.length();i++)
		{
			if(ch[i]==b.charAt(0))
			{
				System.out.println("The string B is start with the character contains by string S is"+"= "+ch[i]+"Having position:"+i);
				break;
			}
		}

	}

}
