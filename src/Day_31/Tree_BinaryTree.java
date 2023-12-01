package Day_31;

class Node{
	int item;
	Node left,right;
	public Node(int key) {
		item=key;
		left=right=null;
	}
}
public class Tree_BinaryTree {
	Node root;
	Tree_BinaryTree(){
		root=null;
	}
	void inorder(Node node) {
		if(node==null)
			return;
		//  Traverse left
		inorder(node.left);
		//   Traverse root
		System.out.print(node.item+"->");
		//  Traverse right
		inorder(node.right);
		
	}
	void preorder(Node node) {
		if(node==null)
			return;
	//   Traverse root
				System.out.print(node.item+"->");	
	//  Traverse left
			preorder(node.left);
			//  Traverse right
			preorder(node.right);
	
	}
	void postorder(Node node) {
		if(node==null)
			return;
		//  Traverse left
		postorder(node.left);
		//  Traverse right
		postorder(node.right);
		//   Traverse root
		System.out.print(node.item+"->");
	}
	public static void main(String[] args) {
		Tree_BinaryTree tr=new Tree_BinaryTree();
		tr.root=new Node(1);
		tr.root.left=new Node(12);
		tr.root.left.left=new Node(5);
		tr.root.left.right=new Node(6);
		tr.root.right=new Node(9);
		System.out.println("Inorder traversal");
		tr.inorder(tr.root);
		System.out.println("\nPreorder traversal");
		tr.preorder(tr.root);
		System.out.println("\nPosteorder traversal");
		tr.postorder(tr.root);

	}

}
