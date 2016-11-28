package MicroC_language;

/**
 * Created by root on 11/28/16.
 */
public interface AbstractWorklist<Edge> {


    void push(Edge edge);

    Edge pop();

    Integer size();
}
