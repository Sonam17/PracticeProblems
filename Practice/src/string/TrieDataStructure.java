package string;

import java.util.HashMap;

public class TrieDataStructure {

	Trie root;
	
	TrieDataStructure(){
		root=new Trie();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieDataStructure ds = new TrieDataStructure();
		
		String[] arr = {"abcd","abc","agl","ghi"};
		for(String input : arr){
			ds.insertNode(input);
		}
		boolean checkWord = false;
		System.out.println(ds.isPrefix("abl", checkWord));
		System.out.println(ds.isWord("lmn"));
		
	}
	
	void insertNode(String input){
		Trie curr = root;
		for(char c : input.toCharArray()){
			int index = (int) c-'a';
				if(curr.children[index] == null){
					Trie node = new Trie();
					curr.children[index] = node;
				}
				curr = curr.children[index];
		}
		curr.endOfWord = true;
	}
	
	
	boolean isPrefix(String s, boolean checkWord){
		Trie curr = root;
		for(char c : s.toCharArray()){
			int index = (int) c-'a';
			if(null == curr.children[index]){
				return false;
			}
			curr = curr.children[index];
		}
		if(checkWord){
			return (curr.endOfWord && true);
		}
		return true;
	}
	
	boolean isWord(String s){
		
		return isPrefix(s,true);
		
	}
	
}

class Trie{
	Trie[] children; 
	boolean endOfWord;
	
	Trie(){
		children = new Trie[26];
		this.endOfWord = false;
	}
}
