package Structure;

public class SinglyLinkedList_delete_last {

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
		Link curent=head;
		while(curent!=null)
		{
			System.out.print(curent.data+"-->");
			curent=curent.next;
		}
		System.out.println("null");
	}
	
	public Link delete_last()
	{
		if(head==null||head.next==null)
		{
			return null;
		}
		else
		{
			Link curent=head;
			Link previous=null;
			while(curent.next!=null)
			{
				previous=curent;
				curent=curent.next;
			}
			previous.next=null;
			return curent;
		}
	}
	public Link delete()
	{
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
	public void deletePostn(int pos)
	{
		Link l=new Link(pos);
		if(pos==1)
		{
			head=head.next;
		}
		else
		{
			Link previous=head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			Link curent=previous.next;
			previous.next=curent.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_delete_last sd=new SinglyLinkedList_delete_last();
		sd.head=new Link(10);
		Link s=new Link(20);
		Link t=new Link(30);
		Link f=new Link(40);
		
		sd.head.next=s;
		s.next=t;
		t.next=f;
		sd.delete_last();
		sd.display();
	}

}
