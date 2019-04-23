package howNodes;

public class AdjancentList {
	int NumVertices;
	Object[] ArrayVertlist = new Object[NumVertices];
	public void insertVertex(Vertices V) {
		NumVertices++;
		Object[] temp = new Object[NumVertices];
		for(int numoftimes = 0; numoftimes <= NumVertices - 1; numoftimes++) {
			if(ArrayVertlist.length == 0) {
				ArrayVertlist = new Vertices[NumVertices];
				ArrayVertlist[numoftimes] = V;
			}
			else {temp[numoftimes] = ArrayVertlist[numoftimes];}
		}
		ArrayVertlist = temp;
	}// u is the node you want to connet too and x is the node wanting to be connected
	public void insertEdges(Vertices u, Vertices x) {
		boolean exists = true;
		for(int numU = 0; numU < ArrayVertlist.length-1; numU++) {
			if(ArrayVertlist[numU] == u) {
				exists = false;
				u.setVertices(x);
			}
		}
		if(exists) {System.out.println(" there is no vertices for this edge");}
	}
}