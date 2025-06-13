package xyz;

public class BinaryTreeTask {
	
	static class Node{
		String data;
		Node left,right;
		
		Node(String value){
			data = value;
			left = right = null;
		}
	}
	 
	static int count = 0;
	public static void countNodes(Node node) {
        if (node != null) {
            count++; 
            countNodes(node.left);
            countNodes(node.right);
        }
    }

	public static void main(String[] args) {
		Node root = new Node("Mom");
		root.left = new Node("Dad");
		root.right = new Node("You");
		
		System.out.println("The root node of binary tree is:"+ root.data);
		System.out.println("The left and the right nodes of the rooot node :"+ root.left.data +" & "+ root.right.data);
		
		countNodes(root);
		System.out.println("The count of nodes in the tree :"+count);
		
		
	}

}
