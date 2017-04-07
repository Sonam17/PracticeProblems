package array;

import java.util.HashMap;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16,17,2,4,5,3};

		
		HashMap<String,String> dimensionsForFlowDim = new HashMap<>();
		dimensionsForFlowDim.put("protocol","6");
		dimensionsForFlowDim.put("dst_ip", "83951882");
		dimensionsForFlowDim.put("src_ip", "167837972");
		dimensionsForFlowDim.put("src_port", "80");
		dimensionsForFlowDim.put("dst_port", "49309");
		
		
		String val = ""+dimensionsForFlowDim.get("protocol")+":"+dimensionsForFlowDim.get("src_ip")+":"+
				dimensionsForFlowDim.get("dst_ip")+":"+dimensionsForFlowDim.get("src_port")+":"+dimensionsForFlowDim.get("dst_port");
		System.out.println("val = "+val);
		
		findLeaders(arr);	//Time - O(n) Space - Constant
	}

	static void findLeaders(int[] arr){
		
		
		System.out.print("\nLeaders : "+arr[arr.length-1]);
		int i=arr.length-2;
		int max = arr[arr.length-1];
		while(i>=0){
			if(max < arr[i]){
				System.out.print(" "+arr[i]);
				max = arr[i];
			}
			i--;
		}
	}
}
