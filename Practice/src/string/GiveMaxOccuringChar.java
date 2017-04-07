package string;

public class GiveMaxOccuringChar {

	public static void main(String[] args) {
		String str = "sample string";
		//String str = "test";
		char[] count = new char[256];
		char[] arr = str.toCharArray();

		for(int i=0;i<arr.length;i++){
			int x = arr[i];
			count[x]++;
		}
		int max = 0;
		int val = 0;
		for(int i=0;i<count.length;i++){
			if(count[i] > max){
				max = count[i];
				val = i;
			}
		}
		System.out.println("Max occuring character is : "+((char)val) + " occuring "+ max +" times");
	}

}
