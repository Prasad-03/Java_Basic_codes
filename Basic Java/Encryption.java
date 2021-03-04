
public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Qsbtbe!Cbcbs";
		System.out.println(s);
		char c[]=s.toCharArray();
		for(char x:c)
		{
			x -=1;
			System.out.print(x);
		}

	}

}
