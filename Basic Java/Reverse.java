
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Prasad";
		String result="";
		for(int i=s.length()-1;i>=0;i--)
		{
			result=result+s.charAt(i);
		}
		System.out.println(result);
		
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		System.out.println(sb);
	}

}
