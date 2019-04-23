package howNodes;

public class Edgelist {
public void getVertices(Edges Ed) {
		if(Ed.E != null) {
		System.out.println(Ed.V1.element + " is connected to " + Ed.V2.element +" by " +Ed.getEdges());
		Ed = Ed.E;
		getVertices(Ed);
		}
		else {System.out.println(Ed.V1.element + " is connected to " + Ed.V2.element+" by " +Ed.getEdges() );}
	}
	public void BFS(Edges E, Object Element) {
		if(E.E == null) {
			if(E.V1.element== Element || E.V2.element == Element) {
				prints(Element);
			}
			else {System.out.println("no element found");}
		}
		else if(E.V1.element == Element) {
			prints(Element);
		}
		else{
			if(E.V2.element == Element) {
				prints(Element);
			}
			else {BFS(E.E, Element);}
		}	
	}
	//this is just a print method for finding the element
	public void prints(Object Element) {
		System.out.println("This element is in this graph.");
		System.out.println("The Number: "+ Element);
	}
}
