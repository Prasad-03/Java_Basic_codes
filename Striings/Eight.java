package Striings;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("Prasad");
		StringBuffer sb2=new StringBuffer("Prasad");
		
//		sb1=sb1.append(sb2);
//		System.out.println(sb1);
		
		int total=sb1.capacity();
		System.out.println("capacity is:"+total);
		
		char c=sb1.charAt(3);
		System.out.println("returning char at position 3:"+c);
		
		int h=sb1.codePointAt(2);
		System.out.println("code points at:"+h);  //gives unicode number of the character
		
		System.out.println(sb1.compareTo(sb2));  //return 0 if same 
		
		sb1.delete(0, 1);
		System.out.println(sb1);
		
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.getClass());
		
		System.out.println(sb1.indexOf("a"));
		
		System.out.println(sb1.insert(2, "l"));
		
		System.out.println(sb1.substring(2));
		
		StringBuilder sb=new StringBuilder("Prasad");
		System.err.println(sb);
	}

}
