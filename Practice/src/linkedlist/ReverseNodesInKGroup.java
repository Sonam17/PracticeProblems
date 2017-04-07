package linkedlist;

public class ReverseNodesInKGroup {

	static Node reverseNodeInKGroup(Node node, int k) {
	
		Node curr = node;
		Node prev=null;
		Node next = null;
		int cnt=1;
		while(cnt<=k && curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			cnt++;
		}
		
		if(next!=null){
			node.next=reverseNodeInKGroup(next,k);
		}
		return prev;
	}

	static void display(MyLinkedList ll){
		Node cur = ll.head;
		System.out.println();
		
		while(cur!=null){
			System.out.print(cur.data+ "  ");
			cur = cur.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 10, 30, 2, 4, 5, 6 };
		int k = 2;
		MyLinkedList ll = new MyLinkedList(arr);
		display(ll);
		ll.head = reverseNodeInKGroup(ll.head, k);
		display(ll);
	}
}
