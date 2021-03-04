package Structure;

import Structure.SinglyLinkedList_Serach.Link;

public class SinglyLinkedList_Reverse {
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
	public void display(Link  head)
	{
		Link Curent=head;
		while(Curent!=null)
		{
			System.out.print(Curent.data+"-->");
			Curent=Curent.next;
		}
		System.out.println("null");
//		return null;
	}
	
	public Link reverse(Link head)
	{
		if(head==null)
		{
			return head;
		}
		Link curent=head;
		Link previous=null;
		Link next=null;
		while(curent!=null)
		{
			next=curent.next;
			curent.next=previous;
			previous=curent;
			curent=next;
		}
		return previous;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_Reverse sr=new SinglyLinkedList_Reverse();
		Link head=new Link(10);
		Link s=new Link(20);
		Link t=new Link(30);
		Link f=new Link(40);
		
		head.next=s;
		s.next=t;
		t.next=f;
		Link rrr=sr.reverse(head);
		sr.display(rrr);
	}

}
