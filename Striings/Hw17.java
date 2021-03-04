package Striings;

public class Hw17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="prasad babar";
		int count=0;
		
		char u=' ';
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&s.charAt(j)!=' '&&s.charAt(j)!='@')
				{
					u=s.charAt(i);
					System.out.print(u);
					count++;
					s=s.replace(s.charAt(j), '@');
				}	
			}
		}
		System.out.println("\ntotal count are:"+count);
	}
}
