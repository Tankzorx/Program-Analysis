package MicroC_language;
import java.util.ArrayList;

public class Edge<V> {

    private V vertex;

    private String label;

    public Edge(V vert, String w) {
        vertex = vert;
        label = w;
    }

    public V getVertex() {
        return vertex;
    }

    public void setVertex(V vertex) {
        this.vertex = vertex;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString(){

        return "( "+ vertex + ", " + label + " )";
    }

}