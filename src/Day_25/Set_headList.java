package Day_25;

public class Set_headList {

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
				tail.next=newNode;   //connecting to the newNode
				tail=newNode;        //moving the tail
			}
		}
		void addFirst(int data) {
			Node newNode= new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				newNode.next=head;
				head=newNode;
			}
		}
		void addEnd(int data) {
			Node newNode= new Node(data);
			@SuppressWarnings("unused")
			Node current=head;
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				/*while(current.next!=null) {
					current=current.next;
				}
				current.next=newNode; */	
				
				//or
				
				tail.next=newNode;
				tail=newNode;
				}
		}
		void addBetween(int pos,int data) {
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
		Set_headList sl =new Set_headList();
		sl.addNode(10);
		sl.addNode(5);
		sl.addNode(20);
		sl.addEnd(70);
		sl.addFirst(100);
		sl.addNode(111);
		sl.addBetween(100, 49);
		sl.display();

	}

	

}
