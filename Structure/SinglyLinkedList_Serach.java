package Structure;

public class SinglyLinkedList_Serach {
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
	
	public void display(Link head)
	{
		Link current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
					
		}
		System.out.println("null");
	}
	public void search(int value)
	{
		Link curnt=head;
		int count=0;
		while(curnt!=null)
		{
			count++;
			if(curnt.data==value)
			{
				System.out.println("Data present at: "+    count    +"  position");
			}
			curnt=curnt.next;
			
		}
	}
	public Link reverse(Link head)
	{
		if(head==null)
		{
			return head;
		}
		Link curent=head;
		Link previous=null;
		Link next=null;
		while(curent!=null)
		{
			next=curent.next;
			curent.next=previous;
			previous=curent;
			curent=next;
		}
		return previous;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_Serach ss=new SinglyLinkedList_Serach();
		Link head=new Link(10);
		Link s=new Link(20);
		Link t=new Link(30);
		Link f=new Link(40);
		
		head.next=s;
		s.next=t;
		t.next=f;
		
		ss.display(head);
		//ss.search(30);
		Link r=ss.reverse(head);
		ss.display(r);
		
	}

}
