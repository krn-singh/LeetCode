package problems;

import java.util.HashMap;

public class Contacts {

	public static void contacts(String[][] queries) {
		/*
		 * Write your code here.
		 */
		Trie trie = new Trie();

		for (int queriesRowItr = 0; queriesRowItr < queries.length; queriesRowItr++) {

			String operation = queries[queriesRowItr][0];
			String value = queries[queriesRowItr][1];

			if (operation.equals("add")) {
				trie.add(value);
			} else if (operation.equals("find")) {
				System.out.println(trie.find(value));
			}
		}
	}
}

class TrieNode {
	private HashMap<Character, TrieNode> children = new HashMap<>();
	public int size = 0; // this was the main trick to decrease runtime to pass tests.

	public void putChildIfAbsent(char ch) {
		children.putIfAbsent(ch, new TrieNode());
	}

	public TrieNode getChild(char ch) {
		return children.get(ch);
	}
}

class Trie {
	TrieNode root = new TrieNode();

	public void add(String str) {
		TrieNode curr = root;
		for (char ch : str.toCharArray()) {
			curr.putChildIfAbsent(ch);
			curr = curr.getChild(ch);
			curr.size++;
		}
	}

	public int find(String prefix) {
		TrieNode curr = root;

		for (char ch : prefix.toCharArray()) {
			curr = curr.getChild(ch);
			if (curr == null) {
				return 0;
			}
		}
		return curr.size;
	}
}