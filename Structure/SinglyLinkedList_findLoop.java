package Structure;

public class SinglyLinkedList_findLoop {
	private Link head;
	public static class Link
	{
		private int data;
		private Link next;
		
		public Link(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
//	public void insert(int value)
//	{
//		Link node=new Link(value);
//		if(head==null)
//		{
//			head=node;
//			return;
//		}
//		Link curent=head;
//		while(curent.next!=null)
//		{
//			curent=curent.next;
//		}
//		curent.next=node;
//	}
	public void display()
	{
		Link curent=head;
		while(curent!=null)
		{
			System.out.print(curent.data+"-->");
			curent=curent.next;
			
		}
		System.out.println("null");
	}
	public boolean Containloop()
	{
		Link fast=head;
		Link slow=head;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
			{
				return true;
			}
		}
		return false;
	}
	public void createLoop()
	{
		Link first=new Link(10);
		Link s=new Link(20);
		Link t=new Link(30);
		Link f=new Link(40);
		Link fi=new Link(50);
		Link si=new Link(60);
		 
		head=first;
		first.next=s;
		s.next=t;
		t.next=f;
		f.next=fi;
		fi.next=si;
		si.next=t;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_findLoop sf=new SinglyLinkedList_findLoop();
//		sf.insert(10);
//		sf.insert(20);
//		sf.insert(30);
//		sf.insert(40);
		
		sf.createLoop();
		System.out.println(sf.Containloop());
//		sf.display();

	}

}
