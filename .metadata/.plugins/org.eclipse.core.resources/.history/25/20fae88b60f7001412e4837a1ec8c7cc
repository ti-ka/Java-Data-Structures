import java.util.ArrayDeque;
import java.util.Queue;


public class Main {

	public static int[][] adj = {
		{0,1,1,1,0,0,0},
		{1,0,0,0,1,1,1},
		{1,0,0,1,0,0,0},
		{1,0,0,0,0,0,1},
		{0,1,0,0,0,1,0},
		{0,1,0,0,1,0,1},
		{0,1,0,1,0,1,0}				
	};
	public static boolean[] visited = new boolean[7];
	public static Queue<Integer> queue = new ArrayDeque<Integer>();
	
	
	
	
	public static void main(String[] args) {
		
		for(int j = 0; j < adj.length; j++){
			visited[j] = false;
		}

		depthFirst(0);
		breadthFirst(0);
		
	}
	

	
	
	
	public static void depthFirst(int v){
		System.out.println("Visting " + v);
		visited[v] = true;
		for(int i = 0; i < adj.length; i++){
			if(
					i != v &&				//Not itself
					adj[i][v] == 1  &&		//Has path
					visited[i] == false		//Not visited
					
			){
					depthFirst(i);
			}
		}		
	}
	
	public static void breadthFirst(int v){
		if(!visited[v]){
			System.out.println("Visting " + v);
			visited[v]  = true;	
		}
		
		for(int i = 0; i < adj.length; i++){
			if(
					i != v &&				//Not itself
					adj[i][v] == 1  &&		//Has path
					visited[i] == false		//Not visited	
			){
					queue.add(i);
					System.out.println("Visting " + i);
					visited[i]  = true;
			}
		}

		//printQueue(queue.toArray());
		if(!queue.isEmpty()){
			breadthFirst(queue.remove());
		}
	}
		
	public static void printQueue(Object[] objects){
		for(int i = 0; i < objects.length; i++){
			int t = (int) objects[i];
			System.out.print(t);
		}

		System.out.print("\n");	
	}

}
	

