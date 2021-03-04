package Structure;

public class SinglyLinkedList_n_element {
	private Link head;
	public static class Link{
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
		Link curnt=head;
		while(curnt!=null)
		{
			System.out.print(curnt.data+"-->");
			curnt=curnt.next;
		}
		System.out.println("null");
	}
	
	public Link nelement(int value)
	{
		Link refptr1=head;
		Link mainptr2=head;
		int count=0;
		while(count<value)
		{
			refptr1=refptr1.next;
			count++;
		}
		while(refptr1!=null)
		{
			refptr1=refptr1.next;
			mainptr2=mainptr2.next;
		}
		return mainptr2;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_n_element sn=new SinglyLinkedList_n_element();
		sn.head=new Link(10);
		Link s=new Link(20);
		Link t=new Link(40);
		Link f=new Link(40);
		
		sn.head.next=s;
		s.next=t;
		t.next=f;
		
//		System.out.println(sn.nelement(2));
//		Link n=sn.nelement(2);
//		System.out.println(n.data);
		sn.remove();
		sn.display();
	}

}
