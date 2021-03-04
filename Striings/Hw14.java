package Striings;

public class Hw14 {

	public static void main(String[] args) {
		String s="Pr123as123ad";
		s=s.replaceAll("[*0-9]", "");  //It gives only alphabets
		System.out.println(s);
		s=s.replaceAll("[^0-9]", "");  //It gives only numbers
		System.out.println(s);
	}

}
