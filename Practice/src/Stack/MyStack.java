package Stack;

public class MyStack {

	int top;
	int[] stack;
	int size = 10;
	
	MyStack(){
		top = -1;
		this.stack = new int[10];
	}
	
	int getSize(){
		return top+1;
	}
	
	int peek(){
		if(top == -1){
			System.out.println("Stack Empty...");
			return 0;
		}else{
			return stack[top];
		}
	}
	
	void push(int data){
		if(top+1 == size){
			System.out.println("Stack Full !!");
		}else{
			stack[++top] = data;
		}
	}
	
	int pop(){
		if(top == -1){
			System.out.println("Stack OverFlow... !!");
			return 0;
		}else{
			return stack[top--];
		}
	}
	
	public String toString(){
		String stack = "";
		int currTop = top;
		while(currTop!=-1)
			stack = stack+" "+this.stack[currTop--];
		return stack;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack();
		s.push(11);
		s.push(3);
		s.push(17);
		
		System.out.println(s.toString());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.getSize());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}

}
