package home.vmware.practice;

import java.util.HashMap;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
	    TrieNode current = root;
	 
	    for (int i = 0; i < word.length(); i++) {
	        current = current.getChildren().computeIfAbsent(word.charAt(i), c -> new TrieNode());
	    }
	    current.setIsWord(true);
	}
	
	public boolean find(String word) {
	    TrieNode current = root;
	    for (int i = 0; i < word.length(); i++) {
	        char ch = word.charAt(i);
	        TrieNode node = current.getChildren().get(ch);
	        if (node == null) {
	            return false;
	        }
	        current = node;
	    }
	    return current.isIsWord();
	}
	
	public void delete(String word) {
	    delete(root, word, 0);
	}
	 
	private boolean delete(TrieNode current, String word, int index) {
	    if (index == word.length()) {
	        if (!current.isIsWord()) {
	            return false;
	        }
	        current.setIsWord(false);
	        return current.getChildren().isEmpty();
	    }
	    char ch = word.charAt(index);
	    TrieNode node = current.getChildren().get(ch);
	    if (node == null) {
	        return false;
	    }
	    boolean shouldDeleteCurrentNode = delete(node, word, index + 1);
	 
	    if (shouldDeleteCurrentNode) {
	        current.getChildren().remove(ch);
	        return current.getChildren().isEmpty();
	    }
	    return false;
	}

	public static void main(String[] args) {
		Trie trie = new Trie();
		 
	    trie.insert("Programming");
	    trie.insert("Prolog");
	    trie.insert("is");
	    trie.insert("a");
	    trie.insert("way");
	    trie.insert("of");
	    trie.insert("life");
	    
	    System.out.println(trie.find("of"));

	}

	static class TrieNode{
		private HashMap<Character, TrieNode> children;
		private String content;
		private boolean isWord;
		
		TrieNode(){
			children = new HashMap<Character, TrieNode>();
			isWord = false;
		}
		/**
		 * @return the children
		 */
		public HashMap<Character, TrieNode> getChildren() {
			return children;
		}
		/**
		 * @param children the children to set
		 */
		public void setChildren(HashMap<Character, TrieNode> children) {
			this.children = children;
		}
		/**
		 * @return the content
		 */
		public String getContent() {
			return content;
		}
		/**
		 * @param content the content to set
		 */
		public void setContent(String content) {
			this.content = content;
		}
		/**
		 * @return the isWord
		 */
		public boolean isIsWord() {
			return isWord;
		}
		/**
		 * @param isWord the isWord to set
		 */
		public void setIsWord(boolean isWord) {
			this.isWord = isWord;
		}
		

	}

}
