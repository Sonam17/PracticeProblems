package linkedlist;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class CheckIfSinglyLinkedListIsPalindrome {

	
	public static void main(String[] args) {
		int[] arr = {1,10,30,10,1,4};
		MyLinkedList ll = new MyLinkedList(arr);
		ll.traverseList();
		System.out.println("\nIs Palindrome = "+isListPallindrome(ll));
	}
	
	static boolean isListPallindrome(MyLinkedList ll){
		
		MyStack stk = new MyStack();
		Node temp = ll.head;
		while(temp!=null){
			stk.push(temp.data); 
			temp = temp.next;
		}
		
		temp = ll.head;
		while(temp!=null){
			if(temp.data != stk.pop())
				return false;
			temp = temp.next;
		}
		return true;
	}
}

class MyStack{
	int top;
	ArrayList stack;
	
	MyStack(){
		stack = new ArrayList<>();
		top = -1;
	}
	
	void push(int data){
		stack.add(++top,data);
	}
	
	int pop(){
		if(null!=stack && stack.size()!=0){
			int data = (int)stack.get(top);
			stack.remove(top--);
			return data;
		}else
			throw new EmptyStackException();
	}
	
	boolean isEmpty(){
		if(null!=stack && stack.size()!=0)
			return false;
		return true;
		
	}
	
}
