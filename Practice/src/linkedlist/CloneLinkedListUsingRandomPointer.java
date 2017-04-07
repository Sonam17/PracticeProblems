package linkedlist;

public class CloneLinkedListUsingRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public RandomListNode copyRandomList(RandomListNode head) {
	    
	    RandomListNode temp = head;
	    
	    //duplicate the nodes
	    while(temp != null){
	        RandomListNode newNode = new RandomListNode(temp.label);
	        newNode.next = temp.next;
	        temp.next = newNode;
	        temp = newNode.next;
	    }

	    temp = head;
	    RandomListNode temp1 = head.next;
	    while(temp.next.next != null){
	        temp1.random = temp.random.next;
	        temp1 = temp1.next.next;       
	        temp = temp.next.next;
	    }
	    //for last node
	    temp1.random = temp.random.next;

	    head = head.next;
	    
	    temp = head;
	    while(temp.next != null){
	        temp.next = temp.next.next;
	        temp = temp.next;
	    }        
	    
	    return head;    

	}

}

class RandomListNode {
    int label;
    RandomListNode next;
    RandomListNode random;
    public RandomListNode(int x) {
        this.label = x;
        this.next = null;
        this.random = null;
    }
}
