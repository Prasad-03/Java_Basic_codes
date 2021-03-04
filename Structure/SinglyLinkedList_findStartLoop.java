package Structure;

import Structure.SinglyLinkedList_findLoop.Link;

public class SinglyLinkedList_findStartLoop {
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
	public void create()
	{
		Link first=new Link(10);
		Link sec=new Link(20);
		Link thr=new Link(30);
		Link fou=new Link(40);
		Link fif=new Link(50);
		Link six=new Link(60);
		
		head=first;
		first.next=sec;
		sec.next=thr;
		thr.next=fou;
		fou.next=fif;
		fif.next=six;
		six.next=thr;
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
	public boolean Containloop()
	{
		Link fast=head;
		Link slow=head;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
			{
				return true;
			}
		}
		return false;
	}
	public Link LoopStart()
	{
		Link fast=head;
		Link slow=head;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast)
			{
				return getValue(slow);
			}
		}
		return null;
	}
	public Link getValue(Link slow)
	{
		Link temp=head;
		while(slow!=temp)
		{
			temp=temp.next;
			slow=slow.next;
			
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList_findStartLoop sf=new SinglyLinkedList_findStartLoop();
		sf.create();
		System.out.println(sf.Containloop());
		System.out.println(sf.LoopStart().data);
//		sf.display();
		

	}

}
