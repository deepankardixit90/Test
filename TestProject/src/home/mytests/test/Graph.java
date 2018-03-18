package home.mytests.test;

import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph
{
	private int V; // No. of vertices

	// Array of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}

	//Function to add an edge into the graph
	void addEdge(int v, int w)
	{
		adj[v].add(w); // Add w to v's list.
	}

	//print all possible paths from one node to another
	void printAllPathsUtil(int v, int d, boolean visited[],ArrayList<Integer> path)
	{
		// Mark the current node as visited and print it
		visited[v] = true;
		path.add(v);
		
		if (v == d) {
		   for (int p : path) {
		       System.out.print(p + " ");
		   } 
		   System.out.println();
		}
        else {
		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (!visited[n])
				printAllPathsUtil(n, d, visited, path);
		}
	}
	path.remove(new Integer(v));
	visited[v] = false;
	}
	

	
	void printAllPaths(int v, int u)
	{
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];
		ArrayList<Integer> path = new ArrayList<Integer>();

		// Call the recursive helper function to print DFS traversal
		printAllPathsUtil(v, u, visited, path);
	}

	public static void main(String args[])
	{
		Graph g = new Graph(4);

		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(1, 3);
		System.out.println("Following are all different paths : ");

		g.printAllPaths(2, 3);
	}
}


