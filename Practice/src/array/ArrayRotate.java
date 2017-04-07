package array;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6};
		int n = arr.length;
		int d = 2;
		int gcd = findGCD(arr.length,2);
		System.out.println("gcd = "+gcd);
		
		int i=0;
		int k=0;
		while(i<2){
			System.out.println("i="+i);
			k = i;
			while(k<arr.length && k+gcd+1 < arr.length){
				System.out.println("k="+k);
				int temp = arr[k];
				arr[k] = arr[k+gcd+1];
				arr[k+gcd+1] = temp;
				k = k+gcd+1;
			}
			
			//int temp = arr[i];
			//arr[i] = arr[i+gcd+1];
			//arr[i+gcd+1] = temp;
			i++;
			
			
			
		}
		for(int j=0;j<arr.length;j++)
			System.out.print(arr[j]+" ");
		
	}
	
	static int findGCD(int num1, int num2){
		
		if(num1 == 0)
			return num2;
		
		while(num2 != 0){
			if(num1>num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		return num1;
	}

}
