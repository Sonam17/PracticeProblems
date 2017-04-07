package linkedlist;

public class ReverseArrElemInLinkedListNode {

}


/**
class Node {
    int[] arr;
    Node next;
    Node prev;    
}

{1,2} <-> {3,4} <-> {7,8} <-> {9,6} <-> NULL

{9,8} <-> {7,6,5,4} <-> {3,2} <-> {1} <-> NULL

*/
/*
void reverseArray2(Node head, Node tail) {
    Node start = head;
    Node end = tail;
    
//    while(start != end){
        int[] startArr = start.arr;
        int[] endArr = end.arr;
        
        
        int startCnt=0, endCount=endArr.length-1;
        while(startCnt<startArr.length &&  endCount>=0 && start != end && start.prev!=end){
            int temp = startArr[startCnt];
            startArr[startCnt] = endArr[endCount];
            endArr[endCount] = temp ;
             startCnt++;
             endCount--;
             

            if(endCount<0){
             end = end.previous;
             endCount=endArr.length-1;    
            }
            if(startCount>=startArr.length){
              start = start.next;
              startCnt=0;
            }
        }

    //start and end = 2nd node
    //startCount = pos 2
    //endCount= pos 4
    while(startCount<endCount && && start.prev!=end){
        int temp = start[startCount];
        start[startCount] = end[endCount];
        end[endCount] = temp;
        startCount++;
        endCount--;
    }

//    } 
        
  }
    
    
}

void reverseArrayElements(Node head) {


    int count = 0;
    Node curr  = head;
    while(curr!=null){
        int cnt = curr.arr.length;
        count = count+cnt;
        curr = curr.next;
    }

    int[] temp = new int[count];
    count = 0;
    curr  = head;
    while(curr!=null){
        int[] tempArr = curr.arr;
        for(int i=0;i<tempArr.length;i++){
            temp[count++]= tempArr[i];
        }
        curr = curr.next;
    }
    
    //temp={1...9};
    
    //count=9
    count--;
    curr  = head;
    while(curr!=null){
        int[] tempArr = curr.arr;
        for(int i=0;i<tempArr.length;i++){
            tempArr[i]= temp[count--];
        }
//        curr.arr = tempArr;
        curr=curr.next;
    }

}*/
