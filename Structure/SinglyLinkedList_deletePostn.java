package Structure;

public class SinglyLinkedList_deletePostn {
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
	public void deletepos(int pos)
	{
		if(pos==1)
		{
			head=head.next;
		}
		else
		{
			Link previous=head;
			int count=1;
			if(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			Link current=previous.next;
			previous.next=current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_deletePostn sd=new SinglyLinkedList_deletePostn();
		sd.head=new Link(10);
		Link s=new Link(20);
		Link t =new Link(30);
		Link f=new Link(40);
		
		sd.head.next=s;
		s.next=t;
		t.next=f;
		sd.deletepos(1);
		sd.display();

	}

}
