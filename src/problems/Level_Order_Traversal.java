package problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_Traversal {
	
    static class Node {
    	int data;
    	Node left;
    	Node right;
    	
    	public Node(int data) {
    		this.data = data;
    	}
    }
    
	public static void levelOrder(Node root) {
	      if(root == null) {
	          return;
	      } else {
	          Queue<Node> queue = new LinkedList<Node>();
	          queue.add(root);
	          while(!queue.isEmpty()) {
	              Node curr = queue.poll();
	              System.out.print(curr.data+" ");

	              if(curr.left != null) {
	                  queue.add(curr.left);
	              }

	              if(curr.right != null) {
	                  queue.add(curr.right);
	              }
	          }
	      }
	      
	    }

		public static Node insert(Node root, int data) {
	        if(root == null) {
	            return new Node(data);
	        } else {
	            Node cur;
	            if(data <= root.data) {
	                cur = insert(root.left, data);
	                root.left = cur;
	            } else {
	                cur = insert(root.right, data);
	                root.right = cur;
	            }
	            return root;
	        }
	    }

	    public static void main() {
	        Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
	        Node root = null;
	        while(t-- > 0) {
	            int data = scan.nextInt();
	            root = insert(root, data);
	        }
	        scan.close();
	        levelOrder(root);
	    }
}
