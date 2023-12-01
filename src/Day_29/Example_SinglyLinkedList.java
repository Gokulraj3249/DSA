package Day_29;

public class Example_SinglyLinkedList {
	class Node{
		int data;
		Node next;
	    public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	void addNode(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	void addNodeBeginning(int data) {
		Node newNode =new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	void addNodelast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	void addInBetween(int pos,int data) {
		Node newNode =new Node(data);
		Node current=head;
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			while(current.data!=pos) {
				current=current.next;
			}
			newNode.next=current.next;
			current.next=newNode;
		}
	}
	void deleteFront() {
		if(head==null)
			return;
		else{
			Node temp=head;
		head=head.next;
		}
	}
	void deleteLast() {
		Node temp=head;
		if(head==null)
			System.out.println("List is empty");
		else {
			while(temp.next!=tail) {
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
		}
	}
	void deleteElement(int data) {
		Node temp=head;
		if(head==null)
			System.out.println("List is empty");
		else {
			if(temp.data==data) {
				temp=temp.next;
				head=temp;
			}
			else {
				while(temp.next.data!=data) {
					temp=temp.next;
				}
				if(temp.next==null)
					System.out.println("Element is not present in the list");
				else {
					temp.next=temp.next.next;
				}
			}
		}
	}
	void display() {
	Node t=head;
	if(t==null) {
		System.out.println("Linked list is empty");
	}
	else {
		System.out.println("\nLinked List: ");
	    while(t!=null) {
	      System.out.print(t.data+" ");
	   	t=t.next;
		}
	}
	}

	public static void main(String[] args) {
		Example_SinglyLinkedList ss=new Example_SinglyLinkedList();
		ss.addNode(2);
		ss.addNode(4);
		ss.addNodeBeginning(6);
		ss.addNodelast(10);
		ss.addNode(12);
		ss.display();
		ss.deleteFront();
		ss.deleteLast();
		ss.display();
		ss.addInBetween(4, 24);
		ss.display();
		ss.deleteElement(4);
		ss.display();

	}

}
