import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day23 {

	static void levelOrder(Node root){
	      //Corner case
	      if(root == null)
	          return;
	        
	        System.out.print(root.data);
	        Queue<Node> queue = new LinkedList<>();
	        queue.add(root.left);
	        queue.add(root.right);
	        
	        while(!queue.isEmpty()){
	            Node p = queue.remove();
	            System.out.print(" "+p.data);
	            if(p.left != null)
	                queue.add(p.left);
	            if(p.right != null)
	                queue.add(p.right);
	        }
	        
	    }

}
