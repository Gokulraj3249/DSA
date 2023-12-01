package Day_26;

public class Single_linkedlist {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int d){
			data=d;
			next= null;
			
		}
	}
	public void insertAtBeginning(int new_data) {
		Node new_node= new Node(new_data);
		new_node.next=head;
	head= new_node;	
	}
	public void insertAfter(Node prev_node,int new_data) {
		if(prev_node==null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node= new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next= new_node;	
	}
	public void insertAtEnd(int new_data) {
		Node new_node= new Node(new_data);
		if(head==null) {
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last= head;
		while(last.next!=null)
			last=last.next;
		last.next=new_node;
		return;
	}
//delete node
	void deleteNode(int position) {
		if(head==null)
			return;
		Node temp=head;
		if(position==0) {
			head=temp.next;
			return;
		}
//Find the key to be deleted
	for(int i=0;temp!=null&&i<position-1;i++)
	temp=temp.next;
//if the key is not present
	if (temp==null||temp.next==null)
		return;
//remove the mode
	Node next=temp.next.next;
	temp.next=next;
	}
	//search a node
	boolean search(Node head,int key) {
		Node current=head;
		while(current!=null) {
			if(current.data==key)
				return true;
			current=current.next;
		}
		return false;
	}
//sort the linked list
	void sortLinkedList(Node head) {
		Node current=head;
				Node index=null;
	int temp;
	if(head==null) {
		return;
	}else {
		while(current!=null) {
			//index points to the node next to current
			index=current.next;
			while(index!=null) {
				if(current.data>index.data) {
					temp=current.data;
					current.data=index.data;
					index.data=temp;
				}
				index=index.next;
				}
			current=current.next;
			}
		}
	}

//print the linked list
	public void printList() {
		Node tnode=head;
		while(tnode!=null) {
			System.out.print(tnode.data+" ");
	tnode=tnode.next;

		}
	}	 

	public static void main(String[] args) {
		Single_linkedlist list =new Single_linkedlist();
		list.insertAtEnd(1);
		list.insertAtBeginning(2);
		list.insertAtBeginning(3);
		list.insertAtEnd(4);
		list.insertAfter(list.head.next, 5);
		System.out.println("Linked list:");
		list.printList();
		System.out.println("\nAfter deleting an element:");
		list.deleteNode(3);
		list.printList();
		System.out.println();
		int item_to_find=3;
		if(list.search(list.head, item_to_find))
			System.out.println(item_to_find+" is found");
		else
			System.out.println(item_to_find+" is not found");
		list.sortLinkedList(list.head);
		System.out.println("\nSorted List:");
		list.printList();
		
		
	}

}
