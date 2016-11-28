package MicroC_language;

import java.util.Stack;

/**
 * Created by root on 11/28/16.
 */
public class RDTuple {

    private String identifier;
    private Stack<Integer> label;

    public RDTuple(String identifier,Stack<Integer> label) {
        this.identifier = identifier;
        this.label = label;
    }

    public Stack<Integer> getLabel() {
        return label;
    }

    public void setLabel(Stack<Integer> label) {
        this.label = label;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
