import java.util.Scanner;
class Stack{
	int size=10;
	int stack[]=new int[size];
		int tos=-1;
	Scanner scan=new Scanner(System.in);	
	void push()
	{
		if(!overflow())
		{
			tos++;
			System.out.println("Enter the item");
			int item=scan.nextInt();
			stack[tos]=item;
			System.out.println("Do you want to insert more?[type y/n]");
			char opt=scan.next().charAt(0);
			if(opt == 'y')
				push();
		}
		else
			System.out.println("Stack is Full");
	}
	void pop()
	{
		if(!underflow())
		{
			System.out.println("Element "+stack[tos]+" is deleted from list");
			tos--;
			System.out.println("Do you want to pop more?[type y/n]");
			char opt=scan.next().charAt(0);
			if(opt == 'y')
				pop();
		}
		else
			System.out.println("Stack is Empty");
	}
	void traverse()
	{
		if(!underflow())
		{
			System.out.println("Stack: ");
			for(int i=tos;i>=0;i--)
				System.out.println(stack[i]);
		}else
			System.out.println("Stack is Empty");
	}
	void peek()
	{
		if(!underflow())
		{
			System.out.println("Top of stack is "+stack[tos]);
		}else
			System.out.println("Stack is empty");
	}
	boolean overflow()
	{
		return (tos==size-1);
	}
	boolean underflow()
	{
		return (tos==-1);
	}
	
void stack()
	{
	System.out.println("Choose the Operation:\n 1: Push \n 2: Pop \n 3: Traverse \n 4: peek \n 5: EXIT");
		int n=scan.nextInt();
		switch(n)
		{
        case 1: push();
            break;
        case 2: pop();
            break;
        case 3: traverse();
            break;
			case 4: peek();
			break
			case 5: System.exit(0);
			break;
        default: System.out.println("Wrong choice");
        }	
			stack();
	}
	
	public static void main(String...args)
	{
		Stack s=new Stack();
		s.stack();
	}
}
