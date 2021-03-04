package Structure;

public class SinglyLinkedList_remove {

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
	
	public void insert(int value)
	{
		Link node=new Link(value);
		if(head==null)
		{
			head=node;
			return;
		}
		Link curent=head;
		while(curent.next!=null)
		{
			curent=curent.next;
		}
		curent.next=node;
	}
	public void remove(int value)
	{

		Link curent=head;
		Link temp=null;
		if(curent!=null&&curent.data==value)
		{
			head=curent.next;
			return ;
		}
		while(curent!=null&&curent.data!=value)
		{
			temp=curent;
			curent=curent.next;
		}
		if(curent==null)
			{return;}
		temp.next=curent.next;
		
		
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
	public static void main(String[] args) {
		SinglyLinkedList_remove sr=new SinglyLinkedList_remove();
		sr.insert(10);
		sr.insert(20);
		sr.insert(30);
		sr.insert(40);
		sr.display();
		sr.remove(30);
		sr.display();
		
	}

}
