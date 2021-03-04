package Collectionn;
import java.util.*;
class Book
{
	int id,quantity;
	String name,authorr;
	public Book(int id, String name,String author,int quantity)
	{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.authorr=author;
	}
}
public class Treemap {

	public static void main(String[] args) {
		Map<Integer,Book> tm=new TreeMap<>();
		Book b1=new Book(1, "prasad", "babar", 20);
		Book b2=new Book(2, "prasad", "babar", 30);
		Book b3=new Book(3, "pooja", "babar", 40);
		tm.put(1,b1);
		tm.put(2, b3);
		tm.put(3, b2);
		
		for(Map.Entry<Integer,Book> mm:tm.entrySet())
		{
			int key=mm.getKey();
			Book b=mm.getValue();
			System.out.println(key+"Details");
			System.out.println(b.id+" "+b.authorr+" "+b.name+" "+b.quantity);
		}
	}

}
