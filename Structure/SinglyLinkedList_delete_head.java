package Structure;

public class SinglyLinkedList_delete_head {
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
	public void display()
	{
		
		Link current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	public Link delete(int value)
	{
		
		if(head==null)
			return null;
		else
		{
			Link curent=head;
			head=head.next;
			curent.next=null;
			return curent;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_delete_head sd=new SinglyLinkedList_delete_head();
		sd.head=new Link(10);
		Link s=new Link(20);
		Link t=new Link(30);
		Link f=new Link(40);
		
		sd.head.next=s;
		s.next=t;
		t.next=f;
		sd.delete(10);
		
		sd.display();

	}

}
