package Structure;

public class SinglyLinkedList_Insert {
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
	public void insert(int value)
	{
		Listnode newnode=new Listnode(value);
		newnode.next=head;
		head=newnode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList_Insert si=new SinglyLinkedList_Insert();


		si.insert(10);
		si.insert(20);
		
		si.display();
	}

}
