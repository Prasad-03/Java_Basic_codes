package Structure;

public class SinglyLinkedList_InsertSort {

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
		Link curent=head;
		while(curent!=null)
		{
			System.out.print(curent.data+"-->");
			curent=curent.next;
		}
		System.out.println("null");
	}
	public Link InsertAtSortedPosition(int value)
	{
		Link node=new Link(value);
		Link curent=head;
		Link temp=null;
		while(curent!=null&&curent.data<node.data)
		{
			temp=curent;
			curent=curent.next;
		}
		node.next=curent;
		temp.next=node;
		return head;
	}
	public void insert(int value)
	{
		Link node =new Link(value);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_InsertSort si=new SinglyLinkedList_InsertSort();
		si.insert(10);
		si.insert(20);
		si.insert(30);
		si.insert(50);
		//si.InsertAtSortedPosition(40);
		si.display();

	}

}


