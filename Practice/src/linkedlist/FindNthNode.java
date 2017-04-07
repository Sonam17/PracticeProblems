package linkedlist;

public class FindNthNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,10,30,2};
		MyLinkedList ll = new MyLinkedList(arr);

		findNthNode(ll,2);
	}
	
	static void findNthNode(MyLinkedList ll , int index){
		
		Node temp = ll.head;
		int ctr = 0;
		while(temp != null ){
			if(ctr == index){
				System.out.println(temp.data);
				break;
			}
			ctr++;
			temp = temp.next;
		}
	}

}
