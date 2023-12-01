package Day_32;

import java.util.*;

//Class Node
class Node{
	protected int data;
	protected Node link;
	
	//Constructor
	public Node() {
		link=null;
		data=0;
	}
	//Constructor
	public Node(int d,Node n) {
		data=d;
		link=n;
	}
	//  Function to set link to next Node
	public void setLink(Node n) {
		link=n;
	}
	// Function to set data to current Node
	public void setData(int d) {
		data=d;
	}
	//  Function to get link to next Node
	public Node getlink() {
		return link;
	}
	//  Function to get data for the next Node
	public int getData() {
		return data;
	}
}
//  Class linkedQueue
public class Linked_Queue_Implement {
	protected Node front,rear;
	public int size;
	//  Constructor
	public Linked_Queue_Implement() {
		front=null;
		rear=null;
		size=0;
	}
	// Function to check if queue is empty
	public boolean isEmpty() {
		return front==null;
	}
	//  Function to get the size of the queue
	public int getSize() {
		return size;
	}
	//  Function to insert an element to the queue
	public void insert(int data) {
		Node nptr =new Node(data,null);
		if(rear==null) {
			front=nptr;
			rear=nptr;
		}
		else {
			rear.setLink(nptr);
			rear=rear.getlink();
		}
		size++;
	}
	//  Function to remove front element from the queue
	public int remove() {
		if(isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		Node ptr=front;
		front=ptr.getlink();
		if(front==null)
			rear=null;
		size--;
		return ptr.getData();
	}
	//  FUnction to check the front element of the queue
	public int peek() {
		if(isEmpty())
			throw new  NoSuchElementException("Underflow Exception");
		return front.getData();
	}
	//  FUnction to display the status of the queue
	public void display() {
		System.out.print("\nQueue = ");
		if(size==0) {
			System.out.print("Empty\n");
			return;
		}
		Node ptr=front;
		while(ptr!=rear.getlink()) {
			System.out.print(ptr.getData()+" ");
			ptr=ptr.getlink();
		}
		System.out.println();
		
	}


	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Linked_Queue_Implement la=new Linked_Queue_Implement();
		System.out.println("Linked Queue Test\n");
		char ch;
		do {
			System.out.println("\nQueue Operations");
			System.out.println("1.insert");
			System.out.println("2.remove");
			System.out.println("3.peek");
			System.out.println("4.check empty");
			System.out.println("5.size");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter integer element to isert");
				la.insert(scan.nextInt());
				break;
			case 2:
				try {
					System.out.println("Removed Element ="+la.remove());
				}
				catch(Exception e) {
					System.out.println("Error : "+e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Peek Element ="+la.peek());
				}
				catch(Exception e) {
					System.out.println("Error : "+e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty status = "+la.isEmpty());
				break;
			case 5:
				System.out.println("Size = "+la.size);
				break;
			default:
				System.out.println("Wrong Enter \n");
				break;
			}
			la.display();
			System.out.println("\nDo you want to continue (Type y or n)\n");
			ch=scan.next().charAt(0);
		}while(ch=='Y'||ch=='y');
	}
	}
