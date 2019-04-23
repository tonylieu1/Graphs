package howNodes;

public class AdjancentList {
	int NumVertices;
	int NumEdges;
	Vertices[] ArrayVertlist = new Vertices[NumVertices];
	public void insertVertex(Vertices V) {
		NumVertices++;
		Vertices[] temp = new Vertices[NumVertices];
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
		NumEdges++;
		boolean exists = true;
		for(int numU = 0; numU < ArrayVertlist.length-1; numU++) {
			if(ArrayVertlist[numU] == u) {
				exists = false;
				u.setVertices(x);
			}
		}
		if(exists) {System.out.println(" there is no vertices for this edge");}
	}
	public void getEdges(Vertices u , Vertices x) {
		int foundednumber = 0;
		boolean exists = false;
		for(int a = 0; a < NumEdges-1;a++) {
			if(u.element == ArrayVertlist[a]) {
				foundednumber = a;
				exists = true;
				break;
			}
			else if(a == NumEdges){System.out.println("No verteice was founded");
			}
		}
		if(exists) {
				if(u.element != ArrayVertlist[foundednumber]) {
			checklist(foundednumber ,x);
		}else {
			System.out.println("this vertices doesn't exist");
		}
		}
	}
	//this is so that it can traveral the list
	public void checklist(int foundednumber, Vertices x) {
		Vertices temp = ArrayVertlist[foundednumber].V;
		while(x.element != temp.V.element || temp.V == null) {
			temp.V = temp.V.V;
		}
		if(temp.V == null) {System.out.println("no number founded");}
		else {System.out.println("found the Vertices : " + x.element +" in " + foundednumber);
		}
	}
	public void removeVertices(Vertices V) {
		NumVertices--;
		int CounterV = 0;
		Vertices[] temp = new Vertices[NumVertices];
		for(int a = 0; a < NumVertices; a++) {
			if(ArrayVertlist[CounterV]!= V) {
				temp[a] = ArrayVertlist[CounterV];
				CounterV++;
			}
			else {
				CounterV++;
				temp[a] = ArrayVertlist[CounterV];
			}
			
		}
	}
	public void removeEdges() {
		
	}
}