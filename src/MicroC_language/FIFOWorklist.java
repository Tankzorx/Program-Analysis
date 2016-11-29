package MicroC_language;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 11/28/16.
 */
public class FIFOWorklist<LabelTuple> implements AbstractWorklist<LabelTuple> {

    private LinkedList<LabelTuple> wl;

    public FIFOWorklist() {
        this.wl = new LinkedList<>();
    }

    @Override
    public void push(LabelTuple edge) {
        this.wl.push(edge);
    }

    @Override
    public LabelTuple pop() {
        return wl.pollLast();
    }

    @Override
    public Integer size() {
        return wl.size();
    }

}
