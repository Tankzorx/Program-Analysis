package MicroC_language;

import java.util.LinkedHashSet;

/**
 * Created by root on 11/28/16.
 */
public class FIFOWorklist<LabelTuple> implements AbstractWorklist<LabelTuple> {

    private LinkedHashSet<LabelTuple> wl;

    public FIFOWorklist() {
        this.wl = new LinkedHashSet<>();
    }

    @Override
    public void push(LabelTuple edge) {
        this.wl.add(edge);
    }

    @Override
    public LabelTuple pop() {
        LabelTuple a = wl.iterator().next();
        wl.remove(a);
        return a;
    }

    @Override
    public Integer size() {
        return wl.size();
    }


}
