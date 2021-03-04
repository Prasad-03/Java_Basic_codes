package Structure;

public class SinglyLinkedList_insertAtPositn {

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
	
	public void insert(int pos,int value)
	{
		Link l=new Link(value);
		if(pos==1)
		{
			l.next=head;
			head=l;
		}
		else
		{
			Link previous=head;
			int count=1;
			if(count<pos - 1)
			{
				previous=previous.next;
				count++;
			}
			Link current=previous.next;
			previous.next=l;
			l.next=current;
		}
	}
	public Link delete(int valu)
	{
//		Link lk=new Link(valu);
		if(head==null) 
		{
			return null;
		}
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
		SinglyLinkedList_insertAtPositn ia=new SinglyLinkedList_insertAtPositn();
		ia.head= new Link(10);
		Link s=new Link(20);
		Link t=new Link(30);
		Link f=new Link(40);
		
		ia.head.next=s;
		s.next=t;
		t.next=f;
		ia.insert(1, 5);
		ia.insert(3, 15);
		ia.delete(5);
		ia.display();

	}

}
