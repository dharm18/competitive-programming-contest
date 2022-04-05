import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class BST {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
    	Node newNode = new Node(data);
    	
    	//check if tree is empty
    	if(this.root == null) {
    		this.root = newNode;
    	}
    	else {
    		Node currentNode = this.root;
    		while(true) {
    			if(data < currentNode.data) {
    				if(currentNode.left == null) {
    					currentNode.left = newNode;
    					return;
    				}
    				currentNode = currentNode.left;
    			}
    			else {
    				if(currentNode.right == null) {
    					currentNode.right = newNode;
    					return;
    				}
    				currentNode = currentNode.right;
    			}
    		}
    	}
    }

    public void remove(Node node) {

    }

    public void print(Node head) {
        if(head == null)
            return;
        
        print(head.left);
        System.out.print(head.data + " ");
        print(head.right);
        //System.out.println();
    }
    
    public void levelOrder(Node node) { // same as BFS
    	if(node == null) 
    		return;
    	
    	Queue<Node> queue = new LinkedList<Node>();
    	queue.add(node);
    	
    	while(!queue.isEmpty()) {
    		
    		Node currentNode = queue.poll();
    		System.out.print(currentNode.data + " -> ");
    		if(currentNode.left != null)
    			queue.add(currentNode.left);
    		if(currentNode.right != null)
    			queue.add(currentNode.right);
    	}
    }
    
    public void dfs(Node node) {
    	if(node == null)
    		return;
    	
    	Stack<Node> stack = new Stack<BST.Node>();
    	stack.add(node);
    	
    	while(!stack.isEmpty()) {
    		Node currentNode = stack.peek();
    		if(currentNode.left != null)
    			stack.push(currentNode.left);
    		if(currentNode.right != null)
    			stack.push(currentNode.right);
    	}
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);
        System.out.println("Printing tree via BFS/LOT");
        bst.levelOrder(bst.root);
    }
}
