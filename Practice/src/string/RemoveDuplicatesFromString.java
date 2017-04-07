package string;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String input = "geeksforgeeks";
		char[] arr = input.toCharArray();

		//sort string characters
		mergeSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "-");
		}

		StringBuilder result = new StringBuilder();
		char prev = arr[0];
		result.append(arr[0]);
		int i=0;
		while (i < arr.length) {
			if(prev != arr[i]){
				result.append(arr[i]);
				prev = arr[i];
			}
			i++;
		}
		System.out.println("\nResult="+result);
	}

	static void mergeSort(char[] arr) {

		int start = 0;
		int end = arr.length;
		char[] arrLeft = null;
		char[] arrRight = null;
		if (arr.length > 1) {
			int mid = start + end / 2;

			arrLeft = new char[mid];
			for (int i = 0; i < mid; i++) {
				arrLeft[i] = arr[i];
			}

			arrRight = new char[arr.length - mid];
			for (int i = mid; i < arr.length; i++) {
				arrRight[i - mid] = arr[i];
			}
			mergeSort(arrLeft);
			mergeSort(arrRight);

			merge(arr, arrLeft, arrRight);
		}
	}

	static void merge(char[] arr, char[] arrL, char[] arrR) {

		int cntL = 0;
		int cntR = 0;
		int cnt = 0;

		while (cntL < arrL.length && cntR < arrR.length) {
			if (arrL[cntL] < arrR[cntR])
				arr[cnt++] = arrL[cntL++];
			else
				arr[cnt++] = arrR[cntR++];
		}

		while (cntL < arrL.length) {
			arr[cnt++] = arrL[cntL++];
		}

		while (cntR < arrR.length) {
			arr[cnt++] = arrR[cntR++];
		}

	}

}
