import java.util.Scanner;
class Queue
{
	int size=10;
	int front=-1,rare=-1;
	int queue[]=new int[size];
	Scanner scan=new Scanner(System.in);
	
	boolean overflow()
	{
		return (rare==size-1);
	}
	boolean underflow()
	{
		return(rare==-1);
	}
	
	void push()
	{
		if(!overflow())
		{
			if(rare==-1)
				front++;
			rare++;
			System.out.println("Enter the item");
			int item=scan.nextInt();
			queue[rare]=item;
			System.out.println("Do you want to insert more?[type y/n]");
			char opt=scan.next().charAt(0);
			if(opt == 'y')
				push();
		}else
			System.out.println("Queue is Full");
	}
	void pop()
	{
		if(underflow())
			System.out.println("Queue is Empty");
		else
		{
			System.out.println("Element "+queue[front]+" is deleted from list");
			if(rare==front || front==size-1)
			{front=-1;
				rare=-1;
			}
			else
				front++;
			System.out.println("Do you want to pop more?[type y/n]");
			char opt=scan.next().charAt(0);
			if(opt == 'y')
				pop();
		}
	}
	void traverse()
	{
		if(!underflow())
		{
			System.out.println("Queue: ");
			for(int i=front;i<=rare;i++)
				System.out.print(queue[i]+" ");
			System.out.println();
		}else
			System.out.println("Queue is Empty");
	}
	void queue()
	{
		System.out.println("Choose the Operation:\n 1: Push \n 2: Pop \n 3: Traverse \n 4: exit  ");
		int n=scan.nextInt();
		switch(n)
		{
        case 1: push();
            break;
        case 2: pop();
            break;
        case 3: traverse();
            break;
		case 4: System.exit(0);
		break;
        default: System.out.println("Wrong choice");
        }	
			queue();
		
	}
	
	public static void main(String...args)
	{
		Queue q=new Queue();
		q.queue();
	}
}