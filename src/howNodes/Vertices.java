package howNodes;

public class Vertices<E> {
	E element;
	Edges E;
	Vertices V;
	
public Vertices(E element, Vertices V){
	this.element = element;
}
public void setVertices(Vertices V) {
	this.V = V;
}

}
