package Heap;

public class MySimpleHeap {

	int[] heap = new int[10];
	int SIZE  = 0;
	
	MySimpleHeap(){
		for(int i=0;i<heap.length;i++)
			heap[i]=999999;
	}
	
	void addData(int data){
		if(SIZE==10){
			System.out.println("HEAP OVERFLOW !!!");
			return;
		}
		heap[SIZE++] = data;
		heapifyUP(SIZE-1);
	}
	
	void heapifyUP(int index){
		if(index<1){
			return;
		}
		int parentIndex = getParent(index);
		if(heap[parentIndex] > heap[index]){
			swap(parentIndex,index);
			heapifyUP(parentIndex);
		}
	}
	
	int removeData(){
		if(SIZE==0){
			System.out.println("HEAP IS EMPTY !!!");
			return -1;
		}
		int minValue = heap[0];
		heap[0] = heap[SIZE-1];
		SIZE--;
		heapifyDown(0);
		return minValue;
	}
	
	void heapifyDown(int index){
		int leftChildValue=9999999,rightChildValue=9999999;
		if(getLeftChildIndex(index)>=10 && getRightChildIndex(index)>=10)
			return;			
		if(getLeftChildIndex(index)<10)	
			leftChildValue = heap[getLeftChildIndex(index)];
		if(getRightChildIndex(index)<10)
			rightChildValue = heap[getRightChildIndex(index)];
		
		if(heap[index] > leftChildValue || heap[index] > rightChildValue){
			if(leftChildValue<rightChildValue){
				swap(index,getLeftChildIndex(index));
				heapifyDown(getLeftChildIndex(index));
			}else{
				swap(index,getRightChildIndex(index));
				heapifyDown(getRightChildIndex(index));
			}
		}
	}
	
	void swap(int parentIndex,int index){
		int temp = heap[parentIndex];
		 heap[parentIndex] = heap[index];
		 heap[index] =  temp;
	}
	
	int getParent(int index){
		return ((index+1)/2)-1;
	}
	
	int getLeftChildIndex(int index){
		return index*2+1;
	}
	
	int getRightChildIndex(int index){
		return index*2+2;
	}
	
	void display(){
		System.out.println();
		for(int i=0;i<SIZE;i++){
			System.out.print(heap[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySimpleHeap heap = new MySimpleHeap();
		heap.addData(3);
		heap.addData(0);
		heap.addData(4);
		heap.display();
		heap.addData(2);
		heap.addData(1);
		heap.addData(5);
		heap.addData(7);
		heap.addData(6);
		heap.display();
		System.out.println(heap.removeData());
		heap.display();
	}

}
