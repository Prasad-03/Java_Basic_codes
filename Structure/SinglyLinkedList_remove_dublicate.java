package Structure;

public class SinglyLinkedList_remove_dublicate {

	private Link head;
	public class Link
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
		Link Curent=head;
		while(Curent!=null)
		{
			System.out.print(Curent.data+"-->");
			Curent=Curent.next;
		}
		System.out.println("null");
	}
	public void remove()
	{
		Link curent=head;
		while(curent!=null&&curent.next!=null)
		{
			if(curent.data==curent.next.data)
			{
				curent.next=curent.next.next;
			}
			else
			{
				curent=curent.next;
			}
		}
	}
//	public void insert(int value)
//	{
//		Link l=new Link(value);
//		l.next=head;
//		head=l;
//	}
	public void inserthead(int value)
	{
		Link l=new Link(value);
		if(head==null)
		{
			head=l;
			return;
		}
		
		Link curent=head;
		while(curent.next!=null)
		{
			curent=curent.next;
		}
		curent.next=l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_remove_dublicate rd=new SinglyLinkedList_remove_dublicate();
		rd.inserthead(10);
		rd.inserthead(20);
		rd.inserthead(30);
		rd.inserthead(40);
		rd.inserthead(40);
		rd.remove();
		rd.display();
		

	}

}
