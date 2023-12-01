package Day_28;

public class Doubly_LinkedList {
	class Node{
		public int data;
		public Node next=null;
		public Node prev=null;
		public Node(int data) {
			this.data=data;
		}
	}
	Node head=null;
	Node tail=null;
	public void addNodeFront(int val) {
		Node temp=new Node(val);
		if(head!=null){
			head.prev=temp;
			temp.next=head;
		}
		head=temp;
		if(tail==null){
			tail=temp;
		}
	}
	public void addNodeBack(int val) {
		Node temp=new Node(val);
		if(tail!=null) {
			tail.next=temp;
			temp.prev=tail;
		}
		tail=temp;
		if(head==null) {
			head=temp;
		}
		//System.out.println("New node added at the End: "+val);
	}
	
	public void removeNodeFront() {
		Node temp=head;
		head=head.next;
		head.prev=null;
		System.out.println("Deleted: "+temp.data);
	
	}
	public void removeNodeBack() {
		Node temp=tail;
		tail=tail.prev;
		tail.next=null;
		System.out.println("Deleted: "+temp.data);
	}
	public void iterateForward() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public void iterateBackward() {
		Node temp=tail;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}

	public static void main(String[] args) {
		Doubly_LinkedList ss=new Doubly_LinkedList();
		ss.addNodeFront(2);
		ss.addNodeFront(100);
		ss.addNodeBack(1200);
		ss.addNodeBack(2000);
		ss.addNodeBack(500);
		System.out.println("Doubly linked list Before remove: ");
		ss.iterateForward();
	    ss.removeNodeFront();
		System.out.println("Doubly linked list After remove Front: ");
		ss.iterateForward();
		ss.removeNodeBack();
		System.out.println("Doubly linked list After remove Back: ");
		ss.iterateForward();
		System.out.println("Iterate Backward: ");
		ss.iterateBackward();

	}

}
