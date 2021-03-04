
public class Hw18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Prasad";
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		System.out.println(temp);
		
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		System.out.println(sb);
	}

}
