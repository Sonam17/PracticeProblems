package Heap;

import java.util.ArrayList;
import java.util.List;

public class MyHeap { //MinHeap Implementation

	Node root;
	List<Node> heapList;
	MyHeap(){
		root = null;
		heapList = new ArrayList<Node>();
	}
	
	void addData(int data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
			heapList.add(newNode);
		}else{
			int lastElemIndex = heapList.size();
			if (lastElemIndex < 3) {
				if (root.leftChild != null)
					root.rightChild = newNode;
				else
					root.leftChild = newNode;
			}
			else {
				int parentOfLastElemIndex = getParentIndex(lastElemIndex)-1;

				Node lastElemParentNode = heapList.get(parentOfLastElemIndex);
				if (lastElemParentNode.leftChild != null) {
					if (lastElemParentNode.rightChild != null) {
						Node nextParent = heapList.get(parentOfLastElemIndex + 1);
						nextParent.leftChild = newNode;
					} else {
						lastElemParentNode.rightChild = newNode;
					}
				} else {
					lastElemParentNode.leftChild = newNode;
				}
			}
			heapList.add(newNode);
		}
		//Node lastElem = (Node) heapList.get(heapList.size()-1);
		heapifyUp(heapList.size());
	}
	
	void heapifyUp(int index){
		if(index<2){
			return;
		}else if(index<3){
			Node parentNode = heapList.get(0);
			Node currNode = heapList.get(index-1);
			if(parentNode.data > currNode.data){
				swap(parentNode,currNode);
			}
		} else {
			int parent = getParentIndex(index) - 1;
			Node currNode = heapList.get(index - 1);
			Node parentNode = heapList.get(parent);
			if (parentNode.data > currNode.data) {
				swap(parentNode,currNode);
				heapifyUp(parent+1);
			}
		}	
	}
	
	Node removeData(){
		//grab the root of the tree
		Node nodeToBeRemoved = root;
		root = heapList.get(heapList.size()-1);

		//remove the link to its parent
		int parentOfLastElemIndex = getParentIndex(heapList.size())-1;
		Node lastElemParentNode = heapList.get(parentOfLastElemIndex);
		if(lastElemParentNode != null){
			if(lastElemParentNode.leftChild != null && lastElemParentNode.leftChild == nodeToBeRemoved){
				lastElemParentNode.leftChild = null;
			}else if(lastElemParentNode.rightChild != null && lastElemParentNode.rightChild == nodeToBeRemoved){
				lastElemParentNode.rightChild=null;
			}
		}
		
		return nodeToBeRemoved;
	}
	
	void swap(Node parentNode, Node currNode){
		int temp = parentNode.data;
		parentNode.data = currNode.data;
		currNode.data = temp;
	}
	
	int getLeftChildIndex(int curr){
		return 2*curr+1;
	}
	
	int getRightChildIndex(int curr){
		return 2*curr+2;
	}
	
	int getParentIndex(int curr){
		return curr/2;
	}
	
	void inorderTraversal(Node curr){
		if(curr!=null){
			System.out.println(curr.data);
			inorderTraversal(curr.leftChild);
			inorderTraversal(curr.rightChild);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHeap heap = new MyHeap();
		heap.addData(3);
		heap.addData(0);
		heap.addData(4);
		heap.addData(2);
		heap.addData(1);
		heap.inorderTraversal(heap.root);
	}

}

class Node{
	int data;
	Node leftChild;
	Node rightChild;
	
	Node(int data){
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
	
}
