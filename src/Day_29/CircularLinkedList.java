package Day_29;

public class CircularLinkedList {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}
		else {
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}	
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			System.out.println("Nodes of the circular linked list: ");
			do{
				System.out.print(current.data+" ");
				current=current.next;
			}while(current!=head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		 CircularLinkedList cc=new  CircularLinkedList();
		 cc.add(1);
		 cc.add(2);
		 cc.add(3);
		 cc.add(4);
		 cc.display();
		

	}

}
