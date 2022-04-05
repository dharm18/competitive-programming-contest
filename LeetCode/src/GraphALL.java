import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphALL {

	private int v;
	private List<List<Integer>> adjancyList = new LinkedList<>();  
	
	public GraphALL(int totalVertex) {
		v = totalVertex;
		adjancyList = new LinkedList<>();
		
		for(int i=0; i<totalVertex; i++) {
			adjancyList.add(new LinkedList<Integer>()); 
		}
	}
	
	public void addVertex(int vertex) {
		adjancyList.add(new LinkedList<Integer>());
	}
	
	public void addEdge(int nodeFrom, int nodeTo) {
		adjancyList.get(nodeFrom).add(nodeTo);
	}

	public void print() {
		for (int i=0; i<v; i++) {
			System.out.println(i + "-> " + adjancyList.get(i));
		}
	}
	
	public void dfs(int startIndex) {
		
	}
	
	public void bfs(int startingVertex) {
		System.out.println(adjancyList);
		
		boolean visited[] = new boolean[v];
		
		Queue<Integer> queue= new LinkedList<>();
		queue.add(startingVertex);
		visited[startingVertex] = true;
		
		while(!queue.isEmpty()) {
			
			int currentNode = queue.poll();
			System.out.print(currentNode + " ");
			
			List<Integer> nodesList = adjancyList.get(currentNode);
			for (Integer index : nodesList) {
				
				if(!visited[index]) {
					visited[index] = true;
					queue.add(index);	
				}
			}
		}
	}
	
	public static void main(String[] args) {
		GraphALL g = new GraphALL(4);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.print();
        g.bfs(2);
	}
}
