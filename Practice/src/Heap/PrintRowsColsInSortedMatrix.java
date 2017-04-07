package Heap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrintRowsColsInSortedMatrix {

	static void printAllRowsColsInSortedOrder(int[][] mat){
		int n = mat.length;
		Queue q = new PriorityQueue<Integer>();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				q.add(mat[j][i]);
			}
			//System.out.println(q);
		}
		
		Iterator itr = q.iterator();
		while(itr.hasNext()){
			System.out.print(q.poll()+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat  =  { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {32, 33, 39, 50},
                {27, 29, 37, 48},
              };
		
		Queue q = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2){
				return o1.compareTo(o2);
			}
		});
		
		
		printAllRowsColsInSortedOrder(mat);
	}

}
