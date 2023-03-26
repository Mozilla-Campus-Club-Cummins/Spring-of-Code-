<!--ISSUE #92 -->

# Documentation Of Graph Data Structure
A Graph is a non-linear data structure consisting of vertices and edges. The vertices are sometimes also referred to as nodes and the edges are lines or arcs that connect any two nodes in the graph. More formally a Graph is composed of a set of vertices( V ) and a set of edges( E ). The graph is denoted by G(E, V).

![image](https://user-images.githubusercontent.com/99066884/227422389-07cfc034-7bc0-4709-be80-043ee859b6c8.png)

## Components of Graph Data Structure
#### Vertices :  
  Each node of the graph is represented as a vertex. In the above example, the labeled circle represents vertices. Thus, A to E are vertices. Sometimes, vertices are also known as vertex or nodes. Every node/vertex can be labeled or unlabelled.
#### Edges : 
 Edge represents a path between two vertices or a line between two vertices.It can be ordered pair of nodes in a directed graph. In the above example, the lines from A to B, B to C, and so on represents edges.Every edge can be labeled/unlabelled.

## Application of Graph Data Structure
- In Computer science graphs are used to represent the flow of computation.
- Google maps uses graphs for building transportation systems, where intersection of two(or more) roads are considered to be a vertex and the road connecting two vertices is considered to be an edge, thus their navigation system is based on the algorithm to calculate the shortest path between two vertices.
- Facebook uses graphs. Using graphs suggests mutual friends. it shows a list of the f following pages, friends, and contact list.
- On social media sites, we use graphs to track the data of the users. liked showing preferred post suggestions, recommendations, etc.
- Graphs are used in biochemical applications such as structuring of protein, DNA etc.

## Types of Graphs in Data Structure
The most common types of graphs in the data structure are below:
#### 1. Undirected:
 A graph in which all the edges are bi-directional. The edges do not point in a specific direction.

![image](https://user-images.githubusercontent.com/99066884/227424700-29cdd857-93cd-40b3-b6d4-405f7df19030.png)

#### 2. Directed:
 A graph in which all the edges are uni-directional. The edges point in a single direction.

![image](https://user-images.githubusercontent.com/99066884/227424992-65884b4d-47cd-42b8-89a0-eb93c61b24a6.png)

#### 3. Weighted Graph:
 A graph that has a value associated with every edge. The values corresponding to the edges are called weights. A value in a weighted graph can represent quantities such as cost, distance, and time, depending on the graph.
   
   An edge in a weighted graph is represented as (u, v, w), where:

-   u is the source vertex
-   v is the destination vertex
-   w represents the weight associated to go from u to v

![image](https://user-images.githubusercontent.com/99066884/227426229-3a69d2ed-5e85-4230-9ac7-1d5d96abf56e.png)

#### 4. Unweighted Graph:
 A graph in which there is no value or weight associated with the edge. All the graphs are unweighted by default unless there is a value associated.

An edge of an unweighted graph is represented as (u, v), where:

- u represents the source vertex
- v is the destination vertex

#### 5. Complete Graphs:
 A graph in which each vertex is connected to every other vertex. Example: A tournament graph where every player plays against every other player.

![image](https://user-images.githubusercontent.com/99066884/227445696-792621f7-de4b-4019-8cf4-35f752513572.png)

#### 6. Null Graph :
 A graph of order n and size zero is a graph where there are only isolated vertices with no edges connecting any pair of vertices.A null graph is a graph with no edges.

![image](https://user-images.githubusercontent.com/99066884/227445619-59d0dc75-571c-4733-af81-ecb721e4962b.png)

#### 7. Trivial Graph :
 A graph is said to be trivial if a finite graph contains only one vertex and no edge.It is also known as a singleton graph or a single vertex graph.

![image](https://user-images.githubusercontent.com/99066884/227446025-9875353a-9ed5-4bf5-b665-852d4bd60951.png)


## Graph Representation in Data Structure
The following two are the most commonly used representations of a graph. 
1. Adjacency Matrix 
2. Adjacency List 

### Adjacency Matrix: 
An Adjacency Matrix is the simplest way to represent a graph. It is a 2D array of V x V vertices with each row and column representing a vertex. The matrix consists of “0” or “1”. 0 depicts that there is no path while 1 represents that there is a path.
  
### Code for creating Adjancency Matrix in C++
``` bash
#include <iostream>
using namespace std;

int main()
{
	// n is the number of vertices
	// m is the number of edges
	int n, m;
	cin >> n >> m;
	int adjMat[n + 1][n + 1];
	for (int i = 0; i < m; i++) {
		int u, v;
		cin >> u >> v;
		adjMat[u][v] = 1;
		adjMat[v][u] = 1;
	}

	return 0;
}
```

### Adjacency List:
It represents a graph as an array (A) of linked lists. The vertices are stored as an index of the one-dimension array and edges are stored as a list. It means that each element of the array Ai is a list. It contains all the vertices adjacent to vertex i.

![image](https://user-images.githubusercontent.com/99066884/227427575-b5770bed-7708-4873-97e3-a123ccd7ed7d.png)

### Code for creating adjancency list in C++
  ``` bash

#include <bits/stdc++.h>
using namespace std;

void addEdge(vector<int> adj[], int u, int v)
{
	adj[u].push_back(v);
	adj[v].push_back(u);
}

void printGraph(vector<int> adj[], int V)
{
	for (int v = 0; v < V; ++v) {
		cout << "\n Adjacency list of vertex " << v
			<< "\n head ";
		for (auto x : adj[v])
			cout << "-> " << x;
			cout<<endl;
	}
}

int main()
{
	int V = 5;
	vector<int> adj[V];
	addEdge(adj, 1, 2);
	addEdge(adj, 1, 3);
	printGraph(adj, V);
	return 0;
}
```

## Operations on Graph Data Structure
Following are the basic graph operations in data structure:

- Add/Remove Vertex – Add or remove a vertex in a graph.
- Add/Remove Edge – Add or remove an edge between two vertices.
- Check if the graph contains a given value.
- Find the path from one vertex to another vertex.

## Graph Traversal in Data Structure
  Graph traversal is a technique to visit the each nodes of a graph G. It is also use to calculate the order of vertices in traverse process.Basically in graph it may happen some time visiters can visit one node more than once. So, this may cause the going the visiters into infinite loop.
  
  There are two graph traversal techniques
1. Breadth-first search
2. Depth-first search
  
  ###  1. Breadth-first search
  Breadth-first search graph traversal techniques use a queue data structure as an auxiliary data structure to store nodes for further processing. The size of the queue will be the maximum total number of vertices in the graph.

  #### Time Complexity: O(V+E)
Where V is the number of vertices and E is the number of edges in the graph.

#### Space Complexity: O(V)
We used an array of size V to store the BFS traversal. We also used an array of size V to keep track of visited vertices. We used a queue of size V to store the vertices.
  
### Code for BFS in C++:
``` bash

#include <bits/stdc++.h>
using namespace std;

class Graph {
	int V; // No. of vertices

	vector<list<int> > adj;

public:
	Graph(int V); // Constructor

	// function to add an edge to graph
	void addEdge(int v, int w);

	void BFS(int s);
};

Graph::Graph(int V)
{
	this->V = V;
	adj.resize(V);
}

void Graph::addEdge(int v, int w)
{
	adj[v].push_back(w); // Add w to v’s list.
}

void Graph::BFS(int s)
{
	// Mark all the vertices as not visited
	vector<bool> visited;
	visited.resize(V, false);

	// Create a queue for BFS
	list<int> queue;

	// Mark the current node as visited and enqueue it
	visited[s] = true;
	queue.push_back(s);

	while (!queue.empty()) {
		// Dequeue a vertex from queue and print it
		s = queue.front();
		cout << s << " ";
		queue.pop_front();

		// Get all adjacent vertices of the dequeued
		// vertex s. If a adjacent has not been visited,
		// then mark it visited and enqueue it
		for (auto adjacent : adj[s]) {
			if (!visited[adjacent]) {
				visited[adjacent] = true;
				queue.push_back(adjacent);
			}
		}
	}
}

int main()
{
	// Create a graph given in the above diagram
	Graph g(4);
	g.addEdge(0, 1);
	g.addEdge(0, 2);
	g.addEdge(1, 2);
	g.addEdge(2, 0);
	g.addEdge(2, 3);
	g.addEdge(3, 3);

	cout << "Following is Breadth First Traversal "
		<< "(starting from vertex 2) \n";
	g.BFS(2);

	return 0;
}
```
  #### Applications of BFS:
 1. Shortest path and minimum spanning tree: BFS can be used to find the shortest path between two vertices in an unweighted graph. It can also be used to find the minimum spanning tree in a weighted graph.

2. Connectivity: BFS can be used to determine if a graph is connected or not. It can also be used to find all the connected components in a graph.

3. Web Crawling: BFS is used in web crawling to discover and index web pages. Starting from a given web page, BFS is used to visit all the pages that are linked to it.

4. Social Networking: BFS can be used to find the shortest path between two people in a social network. It can also be used to identify clusters of people who are closely connected to each other.

5. Maze solving: BFS can be used to solve mazes by exploring all the possible paths from the start point to the end point.

6. Puzzle solving: BFS can be used to solve puzzles such as the sliding puzzle or Rubik's cube. It explores all the possible configurations of the puzzle to find the solution.

7. Artificial Intelligence: BFS can be used in various AI applications such as pathfinding, game playing, and machine learning.

 ### 2. Depth-first search
 
  DFS stands for Depth First Search, is one of the graph traversal algorithms that use Stack data structure. In DFS Traversal go as deep as possible of the graph and then backtrack once reached a vertex that has all its adjacent vertices already visited.Depth First Search (DFS) algorithm traverses a graph in a depthward motion and uses a stack data structure to remember to get the next vertex to start a search when a dead end occurs in any iteration.
  
  ![image](https://user-images.githubusercontent.com/99066884/227609146-2a6a4d0c-868b-412e-9815-eaeec90a87aa.png)
  
  #### Time Complexity:
  Best case	O(V+E)
  Worst case O(V^2)
  
  #### Space Complexity: O(V)
  
  ### Code for DFS
``` bash

#include <bits/stdc++.h>
using namespace std;

class Graph {
public:
	map<int, bool> visited;
	map<int, list<int> > adj;

	// function to add an edge to graph
	void addEdge(int v, int w);

	void DFS(int v);
};

void Graph::addEdge(int v, int w)
{
	adj[v].push_back(w); // Add w to v’s list.
}

void Graph::DFS(int v)
{
	// Mark the current node as visited and
	// print it
	visited[v] = true;
	cout << v << " ";

	// Recur for all the vertices adjacent
	// to this vertex
	list<int>::iterator i;
	for (i = adj[v].begin(); i != adj[v].end(); ++i)
		if (!visited[*i])
			DFS(*i);
}

int main()
{
	// Create a graph given in the above diagram
	Graph g;
	g.addEdge(0, 1);
	g.addEdge(0, 2);
	g.addEdge(1, 2);
	g.addEdge(2, 0);
	g.addEdge(2, 3);
	g.addEdge(3, 3);

	cout << "Following is Depth First Traversal"
			" (starting from vertex 2) \n";

	g.DFS(2);

	return 0;
}
```
  
 #### Advantages of DFS:
 - DFS can be implemented recursively, which makes the code simpler and easier to understand.

- DFS can be used to solve problems that require backtracking, such as maze-solving and puzzle-solving.

- DFS is memory-efficient and can handle large graphs with limited memory.

- DFS can detect cycles in a graph, which is useful in various applications such as cycle detection in a linked list or detecting circular dependencies in software projects.

- DFS can be used to perform a topological sort of a directed acyclic graph (DAG), which is a linear ordering of the vertices that satisfies the ordering of the edges.

- DFS can be used to find a path between two nodes in a graph, and in some cases, it may find a shorter path than other algorithms such as BFS.

- DFS can be easily modified to handle other graph-related problems, such as finding strongly connected components in a directed graph or computing the transitive closure of a graph.


  ## Advantages of Graph Data Structure:
  
  - Pathfinding: Graphs can be used to find the shortest path between two points, which is a common problem in computer science, logistics, and transportation planning.
  
  - Supports complex queries and analysis of data: Graph databases support powerful queries and algorithms, such as pathfinding and network analysis, making it easier to extract insights and patterns from large and complex datasets.
  
  - Can represent a wide variety of data types and formats: Graphs can represent a wide range of data types, such as hierarchical, cyclical, and multi-dimensional data, making them highly versatile.
  
  - Can be used for machine learning and predictive modeling: Graphs can be used to build machine learning models, such as recommendation engines and fraud detection systems, by leveraging the relationships and patterns within the data.
  
  ## Disadvanatages of Graph Data Structure:
  - Graph data structures can be more difficult to implement and maintain compared to simpler data structures.
  
  - Graphs can be more susceptible to data quality issues, such as incomplete or inconsistent data.
  
  - Graphs can be less efficient for storing and retrieving individual data points compared to other data structures.
  
  - Graph data structures can be limited by the size and complexity of the data being modeled.
  
  - Graph databases can require specialized tools and skills for data analysis, modeling, and visualization.
