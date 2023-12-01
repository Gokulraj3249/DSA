package Day_29;

public class hii {
	class Node{
		int data;
		Node next;
		 public Node(int data) {
				this.data=data;
				this.next=null;
			}
	}
	public Node head=null;
	public Node tail =null;
	
	void add(int data) {
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
	void display() {
		Node t=head;
		if(t==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("Linked List:");
			while(t!=null)
				System.out.println(t.data+" ");
			t=t.next;
		}
	}

	public static void main(String[] args) {
		hii nn=new hii();
		nn.add(10);
		nn.add(29);
		nn.display();

	}

}
