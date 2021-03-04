package Structure;

public class SinglyLinkedList_Middle {
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
	public void display(Link head)
	{
		Link curent=head;
		while(curent!=null)
		{
			System.out.print(curent.data+"-->");
			curent=curent.next;
		}
		System.out.println("null");
	}
	public Link middle()
	{
		if(head==null)
		{
			return null;
		}
		Link ptr1=head;
		Link ptr2=head;
		while(ptr2!=null&&ptr2.next!=null)
		{
			ptr1=ptr1.next;
			ptr2=ptr2.next.next;
		}
		return ptr1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_Middle sm=new SinglyLinkedList_Middle();
		sm.head=new Link(10);
		Link s=new Link(20);
		Link t=new Link(30);
		Link f=new Link(40);
		
		sm.head.next=s;
		s.next=t;
		t.next=f;
		
		Link mid=sm.middle();
		System.out.println(mid.data);

	}

}
