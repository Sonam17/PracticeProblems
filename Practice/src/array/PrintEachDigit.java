package array;

public class PrintEachDigit {

	static void printEachDigit(int num){
		int n = num;
		while(n>0){
			int rem = n%10;
			System.out.println(rem+" ");
			n=n/10;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 98765;
		printEachDigit(num);
	}

}
