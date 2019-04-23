package howNodes;

public class AdjancentMatrixs {
	//this is to show relationship of edges
	int NumVertices;
	 int NumEdges;
	 Object[][] ArrayVert = new Object[NumVertices][NumVertices];
	 Edges[] ArrayEdge = new Edges[NumEdges];
	//this is to insert in the arrayAjdlist
	public void insertVertex(Vertices V) {
		NumVertices++;	
		Object[][] temp = new Object[NumVertices][NumVertices]; 
		//this is for putting the data back into a new array so that it does it automatic
		for(int numoftimes = 0; numoftimes <= NumVertices -1; numoftimes++) {
			if(ArrayVert.length == 0) {
				ArrayVert = new Vertices[NumVertices][NumVertices];
				ArrayVert[0][NumVertices] = V.element;
				ArrayVert[NumVertices][0] = V.element;
			}
			else {
				temp[0][numoftimes]= ArrayVert[0][numoftimes];
				temp[numoftimes][0] = ArrayVert[numoftimes][0];
			}
		}
		ArrayVert = temp;
		ArrayVert[0][NumVertices] = V.element;
		ArrayVert[NumVertices][0] = V.element;
	}
	public void insertEdges(Vertices u, Vertices x) {
		NumEdges++;
		Edges E = new Edges(u,x, null, null);
		Edges[] temp = new Edges[NumEdges]; 
		//this is for putting the data back into a new array so that it does it automatic
		for(int numoftimes = 0; numoftimes <= NumEdges -1; numoftimes++) {
			if(ArrayEdge.length == 0) {
				ArrayEdge = new Edges[NumEdges];
				ArrayEdge[numoftimes] = E;
			}
			else {temp[numoftimes] = ArrayEdge[numoftimes];}
		}
		ArrayEdge = temp;
		ArrayEdge[NumEdges] = E;
		ArrayVert[(int) u.element][(int) x.element] = 1;
		ArrayVert[(int) x.element][(int) u.element] = 1;
		ArrayVert[(int) x.element][(int) x.element] = 1;
		ArrayVert[(int) u.element][(int) u.element] = 1;
	}
	public void getEdge(Vertices u, Vertices x) {
		if(ArrayVert[(int) u.element][(int) x.element].equals(1)) {
			for(int b = 0; b < NumEdges-1;b++) {
				if(ArrayEdge[b].V1.element == u.element && ArrayEdge[b].V2.element == x.element) {
					System.out.println(u.element + " And " + x.element + " EdgesNumber: " + b);
					break;
				}
			}
		}
		else {System.out.println("these two vertices has no edges");}
	}
	public void endVertices(Edges E) {
		boolean exists = true;
		for(int b = 0; b < NumEdges-1;b++) {
			if(ArrayEdge[b].E == E) {
				exists = false;
				System.out.println(E.V1.element+" and " +E.V2.element+ "are the vertices for this edgeNumber: "+ b);
			}
		}
		if(exists) {System.out.println(" there is no vertices for this edge");}
	}
	public void removeVertices(Vertices v) {
		NumVertices--;
		System.out.println("the Vertices with the element of " +v.element+ " is removed.");
		Object[][] tempV = new Object[NumVertices][NumVertices];
		for(int numoftimes = 0; numoftimes <= NumVertices -1; numoftimes++) {
			int Counter = 0;
			for(int a = 0; a <= NumVertices - 1; a++) {
			if(v.element != ArrayVert[numoftimes][a]) {
				tempV[a][numoftimes]= ArrayVert[a][Counter];
				tempV[numoftimes][a] = ArrayVert[Counter][a];
				Counter++;
			}
			else {
				Counter++;
				tempV[a][numoftimes]= ArrayVert[a][Counter];
				tempV[numoftimes][a] = ArrayVert[Counter][a];
			}
			}
		}
		NumEdges--;
		int CounterEdge = 0;
		Edges[] tempE = new Edges[NumEdges]; 
		for(int b = 0; b < NumEdges-1;b++) {
			if(ArrayEdge[b].V1 != v||ArrayEdge[b].V2!=v) {
				tempE[b] = ArrayEdge[CounterEdge];
				CounterEdge++;
			}
			else {
				CounterEdge++;
				tempE[b] = ArrayEdge[CounterEdge];
			}
		}
	}
	public void removeEdge(Edges E) {
		NumEdges--;
		int CounterEdge = 0;
		Edges[] tempE = new Edges[NumEdges]; 
		for(int b = 0; b < NumEdges-1;b++) {
			if(ArrayEdge[b].V1 != E.V1 && ArrayEdge[b].V2!=E.V2) {
				tempE[b] = ArrayEdge[CounterEdge];
				CounterEdge++;
			}
			else {
				CounterEdge++;
				tempE[b] = ArrayEdge[CounterEdge];
			}
		}
	}
}
