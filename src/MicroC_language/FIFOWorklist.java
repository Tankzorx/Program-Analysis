package MicroC_language;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 11/28/16.
 */
public class FIFOWorklist<Edge> implements AbstractWorklist<Edge>{

    LinkedList<Edge> wl;

    public FIFOWorklist() {
        wl = new LinkedList<>();
    }

    @Override
    public void push(Edge e) {
        wl.push(e);
    }

    @Override
    public Edge pop() {
        return wl.pop();
    }

    @Override
    public Integer size() {
        return this.wl.size();
    }

    @Override
    public String toString() {
        return this.wl.toString();
    }
}
