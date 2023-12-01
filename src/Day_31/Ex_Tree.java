package Day_31;

class Hode{
	int item;
	Node left,right;
	public Hode(int key){
		item=key;
		left=right=null;
	}
}
public class Ex_Tree {
	Node root;
	Ex_Tree(){
		root=null;
	}
	void Inorder(Node node) {
		if(node==null)
			return;
		Inorder(node.left);
		System.out.print(node.item+"->");
		Inorder(node.right);
	}
	void Preorder(Node node) {
		if(node==null)
			return;
		System.out.print(node.item+"->");
		Preorder(node.left);
		Preorder(node.right);
	}
	void Postorder(Node node) {
		if(node==null)
			return;
		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.item+"->");
	}
	

	public static void main(String[] args) {
		Ex_Tree e=new Ex_Tree();
		e.root=new Node(1);
		e.root.left=new Node(12);
		e.root.left.left=new Node(6);
		e.root.left.left.left=new Node(2);
		e.root.left.left.right=new Node(3);
		e.root.left.right=new Node(10);
		e.root.right=new Node(13);
		e.root.right.left=new Node(8);
		e.root.right.right=new Node(9);
		System.out.print("Inorder: ");
		e.Inorder(e.root);
		System.out.print("\nPreorder: ");
		e.Preorder(e.root);
		System.out.print("\nPostorder: ");
		e.Postorder(e.root);

	}

}
