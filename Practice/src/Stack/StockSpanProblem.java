package Stack;

public class StockSpanProblem {

	static void findStockSpan(int[] S, int[] price, int n){
		MyStack s = new MyStack();
		//for first element
		s.push(0);
		// Span value of first element is always 1
		S[0]=1;
		
		// Calculate span values for rest of the elements
		for(int i=1;i<n;i++){
			// Pop elements from stack while stack is not empty and top of
		      // stack is smaller than price[i]
			while(s.top!=-1 && price[s.peek()] < price[i]){
				//System.out.println("Stack is ="+s.toString());
				//System.out.println(price[s.peek()]);
				//System.out.println(price[i]);
				s.pop();
			}
			// If stack becomes empty, then price[i] is greater than all elements
		      // on left of it, i.e., price[0], price[1],..price[i-1].  Else price[i]
		      // is greater than elements after top of stack
			if(s.top == -1)
				S[i] = i+1;
			else
				S[i] = i-s.peek();
			
			s.push(i);
			
		}
	}
	public static void main(String[] args) {
		int price[] = {10, 4, 5, 90, 120, 80};
		int n = price.length;
		int[] S = new int[n];
		findStockSpan(S,price,n);
		for(int i=0;i<n;i++){
			System.out.print(S[i]+" ");
		}
		
	}

}
