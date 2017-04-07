package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,10,30,2,4,5,6};
		MyLinkedList ll = new MyLinkedList(arr);

		//ll.traverseList();
		//reverseLinkedList(ll);
		//ll.traverseList();
		
		int[] arr1 = {1,2,3};
		ll = new MyLinkedList(arr1);
		reverseListUsingRecursion(ll.head, ll);
		ll.traverseList();
	}

	static Node reverseListUsingRecursion(Node node, MyLinkedList ll){
		
		if(node.next == null){
			ll.head.next=null;
			ll.head = node;
			return node;
		}
		Node curr = reverseListUsingRecursion(node.next, ll);
		curr.next = node;
		
		return node;
	}
	
	static void reverseLinkedList(MyLinkedList ll){
		
		if(ll != null){
			Node prev = null;
			Node curr = ll.head;
			Node next = null;
			
			ll.end = ll.head;
			
			while(curr!=null){
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			ll.head = prev;
		}
		
	}
}
