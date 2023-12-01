package Day_25;


public class SinglyLinkedList {
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
		Node head=null;
		Node tail=null;
		void addNode(int data) {
			Node newNode= new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;   //connecting to the newNode
				tail=newNode;        //moving the tail
			}
		}
		public void display() {
			Node current =head;
			if(head==null) {
				System.out.println("Linked list is empty");
			}
			else {
				System.out.println("Singly Listed List element are: ");
				while(current!=null) {
					System.out.print(current.data+" ");
					current=current.next;
				}
			}
		}

	public static void main(String[] args) {
		SinglyLinkedList sll =new SinglyLinkedList();
		sll.addNode(10);
		sll.addNode(5);
		sll.addNode(20);
		sll.display();
	
	}
	
}
