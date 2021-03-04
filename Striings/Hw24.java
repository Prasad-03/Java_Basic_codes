package Striings;

public class Hw24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Prasad";
		char c[]=s.toCharArray();
		char d[]=new char[s.length()];
		int x[]=new int[20];
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j]&&c[i]!='@')
				{
					count++;
					s.replace(c[j], '@');
				}
			}
			x[i]=count;

				System.out.println(c[i]+"    "+x[i]);
		}
		

	}

}
