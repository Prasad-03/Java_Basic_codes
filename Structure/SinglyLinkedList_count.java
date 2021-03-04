package Structure;

public class SinglyLinkedList_count {

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
		int count=0;
		Listnode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			count++;
			current=current.next;
		}
		System.out.print("null");
		System.out.println("\ntotal length is:"+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_count sc=new SinglyLinkedList_count();
		sc.head=new Listnode(10);
		Listnode second=new Listnode(20);
		Listnode third=new Listnode(30);
		Listnode fourth=new Listnode(40);
		
		sc.head.next=second;;
		second.next=third;
		third.next=fourth;
		sc.display();
		
		
	}

}
