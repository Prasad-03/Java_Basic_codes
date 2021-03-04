package Collectionn;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "Prasad");
		m.put(2, "Ruchika");
		m.put(3, "pranjali");
		m.put(4, "pooja");
	//First way to print
		//System.out.println(m);
	//second way
		//	Set s=m.entrySet();
		//	Iterator it=s.iterator();
		//	while(it.hasNext())
		//	{
		//		Map.Entry e=(Map.Entry)it.next();
		//		//System.out.println(it.next());
		//		System.out.println(e.getKey()+" "+e.getValue());
		//	}
	//Third way..		
	for(Map.Entry mm: m.entrySet())
	{
		
		System.out.println(mm.getKey()+" "+mm.getValue());
	}
	}

}
