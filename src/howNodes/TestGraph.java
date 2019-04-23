package howNodes;

public class TestGraph {
	public static void main(String[] args) {
		//this is my vertices and this is for my edgeList
	Vertices V1 = new Vertices(1, null);
	Vertices V2 = new Vertices(2, V1);
	Vertices V3 = new Vertices(3, V2);
	Vertices V4 = new Vertices(4, V3);
	Vertices V5 = new Vertices(5,V4);
	Vertices V6 = new Vertices(6,V5);
	//this is my edges
	Edges Ed = new Edges(V1, V2,null,  "one");
	Edges Ed2 = new Edges(V3, V4, Ed, "two");
	Edges Ed3 = new Edges(V5, V6, Ed2, "three");
	Edges Ed4 = new Edges(V2, V3, Ed3, "four");
	Graph Gr = new Graph();
	Edgelist el = new Edgelist();
	//this print out the connections
	el.getVertices(Ed4);
	el.BFS(Ed4, 5);
	
	Vertices A1 = new Vertices(1,null);
	Vertices A2 = new Vertices(2,null);
	Vertices A3 = new Vertices(3,null);
	Vertices A4 = new Vertices(4,null);

	}
	
}
