package Collectionn;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		HashMap <Integer,String> m=new HashMap<>();
		m.put(1, "Prasad");
		m.put(2, "Ruchika");
		m.put(3, "pranjali");
		m.put(4, "pooja");
		
		for(Map.Entry mm:m.entrySet())
		{
			System.out.println(mm.getKey()+" "+mm.getValue());
		}
		
		System.out.println(m.containsKey(4));
		HashMap <Integer,String> hm=new HashMap<>();
		hm.put(1, "Prasad");
		hm.put(2, "Ruchika");
		hm.put(3, "pranjali");
		hm.put(4, "pooja");
	System.out.println(hm.hashCode());
		if(hm.entrySet().equals(m.entrySet()))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("unmatched");
		}
	}

}
