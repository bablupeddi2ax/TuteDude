package graphs;
import java.util.*;
public class BFS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] adjM = {
				{0,1,0,1,0,0,0,0,0,0},
				{1,0,1,0,1,0,0,1,0,0},
				{0,1,0,1,0,0,0,0,1,1},
				{1,0,1,0,0,0,0,0,0,0},
				{0,1,0,0,0,1,1,1,0,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,1,0,0,1,0,0,1,0,0},
				{0,1,0,0,1,0,1,0,0,0},
				{0,0,1,0,0,0,0,0,0,0},
				{0,0,1,0,0,0,0,0,0,0},
				};
		System.out.println(1);
				bfs(0,adjM,10);
	}
	public static void bfs(int vtx, int[][] adjM, int n) {
	    Queue<Integer> q = new LinkedList<>();
	    int[] visited = new int[n];
	    Arrays.fill(visited, 0);
	    System.out.println(vtx + " ");
	    visited[vtx] = 1;
	    q.add(vtx);

	    while (!q.isEmpty()) {
	        int u = q.peek();
	        q.remove(u);
	        for (int v = 0; v < n; v++) {
	            if (adjM[u][v] == 1 && visited[v] == 0) {
	                System.out.println(v);
	                visited[v] = 1;
	                q.add(v);
	            }
	        }
	    }
	}

		
	
}
