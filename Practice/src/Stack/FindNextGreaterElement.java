package Stack;

public class FindNextGreaterElement {
	
	
	static void findNextGreaterElem(MyStack s, int[] arr){
		
		int next,elemAtTop;
		s.push(arr[0]);
		
		for(int i=1;i<arr.length;i++){
			
			next = arr[i];
				if(s.top != -1){
				elemAtTop = s.pop();
				while(elemAtTop < next){
					System.out.println(elemAtTop + " - "+ next);
					if(s.top==-1)
						break;
					elemAtTop = s.pop();
				}
				if(elemAtTop > next)
					s.push(elemAtTop);
				s.push(next);
			}
		}
		
		//pop out remaining elements which did not find a greater elem
		while(s.top!=-1){
			elemAtTop=s.pop();
			System.out.println(elemAtTop + " - "+ -1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3, 5, 2, 25};  //{11, 13, 21, 3};
		MyStack s = new MyStack();
		findNextGreaterElem(s,arr);
	}

}
