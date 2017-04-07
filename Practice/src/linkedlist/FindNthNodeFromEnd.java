package linkedlist;

public class FindNthNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,10,30,2,4,5,6};
		MyLinkedList ll = new MyLinkedList(arr);

		findNthNodeFromEnd(ll,3);
		
	}
	
	static void findNthNodeFromEnd(MyLinkedList ll, int index){

		Node ctr1 = ll.head;
		Node ctr2 = ll.head;
		for(int i=0;i<index-1;i++){
			ctr2 = ctr2.next;
		}
		System.out.println(ctr2.data);
		
		while(ctr2.next!=null){
			ctr1 = ctr1.next;
			ctr2 = ctr2.next;
		}
		System.out.println("Output="+ctr1.data);
		
	}

}
