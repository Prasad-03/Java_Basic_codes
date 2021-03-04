interface Dem
{
	String s="Hello";
	static void cal()
	{
		System.out.println("method call");
	}
}
public class InterfaceEx implements Dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s);
		
		InterfaceEx e=new InterfaceEx();
		Dem.cal();
		

	}

}
