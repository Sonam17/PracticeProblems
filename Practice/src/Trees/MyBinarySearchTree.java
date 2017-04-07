package Trees;

public class MyBinarySearchTree {

	Node root;
	
	MyBinarySearchTree(){
		root = null;
	}
	
	public static void main(String[] args) {
		
		MyBinarySearchTree myTree = new MyBinarySearchTree();
		myTree.addNode(4);
		myTree.addNode(1);
		myTree.addNode(3);
		myTree.addNode(5);
		myTree.addNode(2);
		
		System.out.println("INORDER");
		myTree.inOrderTravesal(myTree.root);
		System.out.println("\nPREORDER");
		myTree.preOrderTravesal(myTree.root);
		System.out.println("\nPOSTORDER");
		myTree.postOrderTravesal(myTree.root);
	}
	
	void inOrderTravesal(Node node){
		if(null != node){
			inOrderTravesal(node.left);
			System.out.print(node.data+" ");
			inOrderTravesal(node.right);
		}
	}
	
	void preOrderTravesal(Node node){
		if(null != node){
			System.out.print(node.data+" ");
			preOrderTravesal(node.left);
			preOrderTravesal(node.right);
		}
	}
	
	void postOrderTravesal(Node node){
		if(null != node){
			postOrderTravesal(node.left);
			postOrderTravesal(node.right);
			System.out.print(node.data+" ");
		}
	}

	void addNode(int d){
		if(null == root){
			root = new Node(d);
		}else{
			Node curr = root;
			Node newNode = new Node(d);
			while(true){
				if(curr.data<=d){
					if(null == curr.right){
						curr.right = newNode;
						break;
					}
					curr = curr.right;
				}else{
					if(null == curr.left){
						curr.left = newNode;
						break;
					}
					curr = curr.left;
				}
			}
		}
	}
	
}

class Node{
	
	Node left;
	Node right;
	int data;
	
	Node(int data){
		this.data= data;
		this.left = null;
		this.right = null;
	}
	
	public String toString(){
		return ""+this.data;
	}
}
