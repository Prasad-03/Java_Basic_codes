package Structure;

public class SinglyLinkedList {

	private Listnode head;
	private static class Listnode
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
		Listnode curnt=head;
		while(curnt!=null)
		{
			count++;
			System.out.print(curnt.data +"-->");
			curnt=curnt.next;
		}
		System.out.print("null");
		System.out.println("\nTotal length is:"+count);
	}
	
	public void insert(int value)
	{
		Listnode newnode=new Listnode(value);
		newnode.next=head;
		head=newnode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList s=new SinglyLinkedList();
//		s.head=new Listnode(10);
//		Listnode second=new Listnode(1);
//		Listnode third=new Listnode(8);
//		Listnode fourth=new Listnode(11);
//
//		s.head.next=second; //10-->1
//		second.next=third;  //10-->1-->8
//		third.next=fourth;  //10-->1-->8-->11
//
		s.insert(3);  //since we add 3 first bt it will shown to thrd position it means the 2&1 added in front
		s.insert(2);
		s.insert(1);
		s.display();
	}

}
