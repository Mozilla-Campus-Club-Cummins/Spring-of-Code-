<!--Issue #76-->

# ***GRAPH DATA STURUCTURE DOCUMENTATION***
Hi , I'm Sanskruti . <br/>
I am Currently Working on 'GRAPH DATA STURUCTURE DOCUMENTATION' problem statement .<br/>

you can reach me on:
Mail: sanskrutiwakode@gmail.com <br/><br/>

## Description
- This project explains Graph Data Structure ,its working and Creation.<br/>
- Time complexity and Space complexity of each operation performed on the Graph.

## **Introduction to Graph Data Structure**
A graph is a non-linear data structure that consists of a collection of nodes (also called vertices) and edges that connect pairs of nodes. It is a fundamental data structure used in computer science and is often used to represent relationships between objects or entities. <br/>
There are two main types of graphs: directed graphs and undirected graphs. In a directed graph, each edge has a direction, whereas in an undirected graph, edges have no direction. <br/>

![img](https://media.geeksforgeeks.org/wp-content/uploads/20200630111809/graph18.jpg)

- The Graph data structure has several important properties that make it a useful tool for modeling relationships between entities:
    1. Nodes or vertices: Graphs consist of a set of nodes or vertices, which represent the entities or objects being connected.
    2. Edges: Edges are the connections between nodes in a graph. Edges can be directed or undirected, and can have weights or other attributes associated with them.
    3. Degree: The degree of a node in a graph is the number of edges that connect to it. In a directed graph, the degree can be split into in-degree and out-degree, which represent the number of incoming and outgoing edges, respectively. 
    4. Path: A path in a graph is a sequence of nodes that are connected by edges. The length of a path is the number of edges in the path
    5. Cycle: A cycle in a graph is a path that starts and ends at the same node. 
    6. Connectedness: A graph is connected if there is a path between any two nodes in the graph. If a graph is not connected, it can be broken down into connected components. 
    7. Weighted graph: A weighted graph is a graph where each edge has a weight or cost associated with it.
    8. Directed acyclic graph (DAG): A directed acyclic graph is a directed graph that has no cycles. DAGs are commonly used in modeling dependencies between tasks or events. 

- Graph data structures support several operations, including:
     1. Add node: Add a new node or vertex to the graph.
     2. Add edge: Add a new edge connecting two nodes in the graph. In a weighted graph, this operation can also include specifying the weight or cost of the edge.
     3. Remove node: Remove a node and all its associated edges from the graph.
     4. Remove edge: Remove an edge connecting two nodes in the graph.
     5. Traverse: Traverse the graph, visiting each node and/or edge in some order. Common traversal algorithms include breadth-first search, depth-first search, and Dijkstra's algorithm.
     6. Shortest path: Find the shortest path between two nodes in the graph. Dijkstra's algorithm and Bellman-Ford algorithm are commonly used for this operation.
     7. Minimum spanning tree: Find the minimum spanning tree, which is a subgraph that connects all nodes in the graph with the minimum total weight or cost. Prim's algorithm and Kruskal's algorithm are commonly used for this operation.
     8. Cycle detection: Determine whether a cycle exists in the graph. This operation is important for identifying potential problems or inconsistencies in the graph.
     9. Topological sorting: Sort the nodes in a directed acyclic graph in such a way that if there is a directed edge from node A to node B, then A appears before B in the sorted order.

#### IMPLEMENTATION

-Adjacency matrix: A two-dimensional matrix where the rows and columns represent the nodes in the graph, and the values in the matrix represent the presence or absence of edges between nodes. This implementation is useful for dense graphs where the number of edges is close to the maximum possible number of edges.

![img](https://media.geeksforgeeks.org/wp-content/uploads/20200630124726/adjacency_mat1.jpg)

-Adjacency list: A collection of lists, where each list corresponds to a node in the graph and contains the nodes that are connected to it by an edge. This implementation is useful for sparse graphs where the number of edges is much smaller than the maximum possible number of edges.

![img](https://media.geeksforgeeks.org/wp-content/uploads/20200630125356/adjacency_list.jpg)

### CREATION OF ADJACENCY MATRIX 
``` bash
void create_adjmat()
	{
		int i,j,ans;
		System.out.println("How Many Nodes ?");
		n=sc1.nextInt();
		do
		{
			System.out.println("Enter From which Node :");
			i=sc1.nextInt();
			System.out.println("Enter To Which Node :");
			j=sc1.nextInt();
			g[i][j]=1;
			g[j][i]=1;
			System.out.println("Do You Want to Add More Nodes ?");
			ans=sc1.nextInt();
		}while(ans==1);
	}
```
##### Time Complexity
 - Best : O(V+E),where V is the number of Vertices and E is the number of Edges in the graph.
 - Worst : O(V^2),where V is the number of Vertices in the graph.

##### Space Complexity 
- O(V^2),where V is the number of Vertices in the graph.

### DISPLAY OF ADJACENCY MATRIX
``` bash
void show_adjmat()
	{
		int i,j;
		System.out.println("Graph is :");
		for(i=0;i<n;i++)
		{
			System.out.println("\n\t");
			for(j=0;j<n;j++)
			{
				System.out.println("\t"+g[i][j]);
			}
		}
	}
```
##### Time Complexity 
- Best : O(V^2),where V is the number of Vertices in the graph.
- Worst : O(V^2),where V is the number of Vertices in the graph.

##### Space Complexity
- O(V^2),where V is the number of Vertices in the graph.

### BFS TRAVERSAL ( Adjacency Matrix )
``` bash
void bfs_adjmat()
	{
		int v,i;
		Scanner sc1=new Scanner(System.in);
		int a[]=new int[10];
		int rear=-1,front=-1;
		int visited[]=new int[10];
		System.out.println("Enter Node To Start :");
		v=sc1.nextInt();
		for(i=0;i<n;i++)
		{
			if(i==v)
				visited[i]=1;
			else
				visited[i]=0;
		}
		rear++;
		a[rear]=v;
		while(front!=rear)
		{
			front++;
			v=a[front];
			System.out.println("\n\t"+v);
			for(int j=0;j<n;j++)
			{
				if(g[v][j]==1 && visited[j]==0)
				{
					rear++;
					a[rear]=j;
					visited[j]=1;
				}
			}
			for(i=0;i<n;i++)
			{
				if(visited[i]==0)
				{
					visited[i]=1;
					System.out.println("\n\t"+i);
				}
			}
		}
	}
```
##### Time Complexity 
- Best : O(V+E),where V is the number of Vertices and E is the number of Edges in the graph.
- Worst : O(V^2),where V is the number of Vertices in the graph.

##### Space Complexity 
-  O(V),where V is the number of Vertices in the graph.

### DFS TRAVERSAL ( Adjacency Matrix )
``` bash
void dfs_adjmat(int v)
	{
		vis[v]=1;
		System.out.println("\n\t"+v);
		for(int i=0;i<n;i++)
		{
			if(g[v][i]==1 && vis[i]==0)
			{
				dfs_adjmat(i);
			}
		}
	}
```
##### Time Comlexity 
- Best : O(V+E),where V is the number of Vertices and E is the number of Edges in the graph.
- Worst : O(V^2),where V is the number of Vertices in the graph.

##### Space Complexity
- O(V), where V is the number of Vertices in the graph.

## ***Conclusion***
Graphs are a powerful data structure that can be used to model a wide variety of real-world problems. They consist of a set of vertices (nodes) and a set of edges that connect pairs of vertices.<br/>
Overall, Graphs are a fundamental data structure in computer science and are widely used in fields such as computer networking, social networks, and data analysis.




