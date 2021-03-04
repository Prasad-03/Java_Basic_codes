package Collectionn;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lk=new LinkedHashMap<>();
		lk.put(1, "Prasad");
		lk.put(2, "Ruchika");
		lk.put(3, "pranjali");
		lk.put(4, "pooja");
		System.out.println(lk.keySet());
		System.out.println(lk.values());
		System.out.println(lk.entrySet());
		for(Map.Entry mm:lk.entrySet())
		{
			System.out.println(mm);
		}

	}

}
