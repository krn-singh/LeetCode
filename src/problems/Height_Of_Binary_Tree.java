package problems;

import java.util.Scanner;

public class Height_Of_Binary_Tree {

	
    static class Node {
    	int data;
    	Node left;
    	Node right;
    	
    	public Node(int data) {
    		this.data = data;
    	}
    }
    	
	
	public static int height(Node root) {
      	// Write your code here.
          if(root == null) {
              return -1;
          } else {
              int lHeight = height(root.left);
              int rHeight = height(root.right);

              if(lHeight > rHeight) {
                  return lHeight + 1;
              } else {
                  return rHeight + 1;
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
        int height = height(root);
        System.out.println(height);
    }
}
