package graphs;
import java.util.*;
public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringBuilder sb = new StringBuilder();
	sb.
		 int[][] aM = {
		            {0, 1, 1, 0},  // Vertex 0 is connected to vertices 1 and 2
		            {1, 0, 0, 1},  // Vertex 1 is connected to vertices 0 and 3
		            {1, 0, 0, 0},  // Vertex 2 is connected to vertex 0
		            {0, 1, 0, 0}   // Vertex 3 is connected to vertex 1
		        };
		 dfs(0,aM,4);
	}
	public static void dfs(int start,int[][] m,int size) {
		Stack<Integer> s = new Stack<>();
		int[] visited = new int[size];
		Arrays.fill(visited, 0);
		visited[start] = 1;
		s.add(start);
		for()

}
