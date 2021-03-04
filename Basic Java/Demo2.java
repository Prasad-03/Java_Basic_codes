import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String w=sc.next();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<w.length();i++)
		{
			int total=97-(int)w.charAt(i)+122;
			sb.append((char)total);
		}
		String s=sb.toString();
		System.out.println(s);

	}

}
