package Heap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargestUsingHeap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
		Queue pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2){
				return o2.compareTo(o1);
			}
		});

	
		for(int i=0;i<arr.length;i++)
			pq.add(arr[i]);
		
		
		System.out.println("PQ Created as = "+pq);
		pq.remove();
		System.out.println("PQ Created as = "+pq);
		
		for(int i=0;i<arr.length-1;i++){
			System.out.print(pq.poll()+" ");
		}
		
		Iterator itr = pq.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+ " - ");
		
	}

}
