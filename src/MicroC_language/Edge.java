package MicroC_language;
import java.util.ArrayList;

public class Edge<V> {

    private V vertex;

    private BasicOperation label;

    public Edge(V vert, BasicOperation w) {
        vertex = vert;
        label = w;
    }

    public V getVertex() {
        return vertex;
    }

    public void setVertex(V vertex) {
        this.vertex = vertex;
    }

    public BasicOperation getLabel() {
        return label;
    }

    public void setLabel(BasicOperation label) {
        this.label = label;
    }

    public String toString(){

        return "( "+ vertex + ", " + label + " )";
    }

}