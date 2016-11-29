package MicroC_language;

import java.util.Stack;

/**
 * Created by root on 11/29/16.
 */
public class LabelTuple {

    private Stack<Integer> fromLabel;
    private Stack<Integer> toLabel;
    private BasicOperation op;

    public LabelTuple(Stack<Integer> fromLabel,Stack<Integer> toLabel,BasicOperation op) {
        this.fromLabel = fromLabel;
        this.toLabel = toLabel;
        this.op = op;
    }

    public Stack<Integer> getToLabel() {
        return toLabel;
    }

    public void setToLabel(Stack<Integer> toLabel) {
        this.toLabel = toLabel;
    }

    public Stack<Integer> getFromLabel() {
        return fromLabel;
    }

    public void setFromLabel(Stack<Integer> fromLabel) {
        this.fromLabel = fromLabel;
    }


    @Override
    public String toString() {
        return fromLabel.toString() + " -> " + toLabel.toString() + " (" + op + ")";
    }

    public BasicOperation getOp() {
        return op;
    }

    public void setOp(BasicOperation op) {
        this.op = op;
    }
}
