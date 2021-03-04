package Structure;

public class SinglyLinkedList_insert_end {
	private Listnode head;
	public static class Listnode
	{
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void display()
	{
		Listnode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	public void insertLast(int value)
	{
		Listnode  newnode=new Listnode(value);
		if(head==null)
		{
			head=newnode;
			return;
		}
		Listnode curent=head;
		while(curent.next!=null)
		{
			curent=curent.next;
		}
		curent.next=newnode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_insert_end ie=new SinglyLinkedList_insert_end();
				
		ie.insertLast(10);
		ie.insertLast(20);
		ie.insertLast(30);
		ie.display();

	}

}
