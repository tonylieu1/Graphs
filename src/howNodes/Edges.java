package howNodes;

public class Edges {
	Vertices V1;
	Vertices V2;
	Edges E;
	String NameEdge;
public Edges(Vertices V1, Vertices V2, Edges E,String EdgeNum) {
	this.V1 = V1;
	this.V2 = V2;
	this.E = E;
	this.NameEdge = EdgeNum;
}
public String getEdges() {
	return NameEdge;
}
}
