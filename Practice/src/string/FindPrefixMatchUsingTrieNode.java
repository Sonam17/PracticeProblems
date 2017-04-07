package string;

public class FindPrefixMatchUsingTrieNode {

	TrieNode root;
	
	FindPrefixMatchUsingTrieNode(){
		root=new TrieNode();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] words = {"+rock", "+stage","-rock","+rockstar"}; 
		String[] words = {"+rock", "+stage","+rockstar","+star"};
		int sum = 0;
		
		FindPrefixMatchUsingTrieNode trie = new FindPrefixMatchUsingTrieNode();
		for(String w : words){
			char[] wArr = w.toCharArray();
			if(wArr[0] == '+')
				sum = trie.addToTrie(wArr,sum);
			else if(wArr[0] == '-')
				trie.removeFromTrie(wArr);
			System.out.println("Sum after word "+w+" = "+sum);
		}
	}

	 void removeFromTrie(char[] a){
		TrieNode curr = root;
		for(int i=1;i<a.length;i++){
			int index = a[i]-'a';
			if(curr.arr[index] != null){
				TrieNode node = curr.arr[index];
				node.cnt--;
				curr = node;
			}
		}
	}
	
	 int addToTrie(char[] a, int sum){
		TrieNode curr = root;
		
		for(int i=1;i<a.length;i++){
			int index = a[i]-'a';
			if(curr.arr[index] == null){
				TrieNode newNode = new TrieNode();
				curr.arr[index] = newNode;
				curr.endWord = false;
			}else{
				sum = sum + (i*curr.arr[index].cnt);
			}
			curr.arr[index].cnt++;
			curr = curr.arr[index];
		}
		curr.endWord = true;
		return sum;
	}

}

class TrieNode{
	
	TrieNode[] arr;
	int cnt;
	boolean endWord;
	
	TrieNode(){
		this.arr = new TrieNode[26];
		this.cnt = 0;
		this.endWord = false;
	}
	
}
