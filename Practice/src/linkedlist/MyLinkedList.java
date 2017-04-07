package linkedlist;

public class MyLinkedList {
	
	Node head;
	Node end;
	
	MyLinkedList(){
		head = null;
		end = null;
	}
	
	MyLinkedList(int[] arr){
		head = null;
		end = null;
		for(int i=0;i< arr.length;i++){
			addNode(arr[i]);
		}
	}
	
	Node getHead(){
		return head;
	}
	
	boolean isEmpty(){
		if(head == null)
			return true;
		
		return false;
	}
	
	
	void delete(){
		if(head != null){
			head = head.next;
			if(head == null)
				end = null;
		}
	}
	
	void addNode(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			end = node;
			return;
		}
		end.next=node;
		end = node;
	}
	
	void traverseList(){
		Node temp = head;
		System.out.println("\nList is = ");
		while(temp.next!=null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	
}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
}
