class LinkedListTraversal
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{data=d;
		next=null;}
	}
	void printList(Node n)
	{
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next; 
		}
	}
	public static void main(String...args)
	{
		LinkedListTraversal list=new LinkedListTraversal();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		list.head.next=second;
		second.next=third;
		list.printList(list.head);
	}
}