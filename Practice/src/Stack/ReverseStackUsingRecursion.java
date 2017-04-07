package Stack;

public class ReverseStackUsingRecursion {

	static void reverseStack(MyStack s){
		
		if(s.top!=-1){
			int data = s.pop();
			reverseStack(s);
			insertAtBottom(s,data);
		}
		
	}
	
	static void insertAtBottom(MyStack s, int data){
		if(s.top==-1){
			s.push(data);
		}else{
			int d = s.pop();
			insertAtBottom(s,data);
			s.push(d);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4, 5, 2, 25,3};  //{11, 13, 21, 3};
		MyStack s = new MyStack();
		for(int i=0;i<arr.length;i++)
			s.push(arr[i]);
		System.out.println("Stack = "+s.toString());
		reverseStack(s);
		System.out.println("Stack = "+s.toString());
	}

}
