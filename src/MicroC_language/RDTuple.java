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

    public int hashCode() {
        return this.identifier.hashCode() + getLabel().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof RDTuple))
            return false;

        RDTuple other = (RDTuple)obj;

        if (identifier == other.getIdentifier()) return true;
        if (identifier == null) return false;

        // equivalence by id
        return identifier.equals(other.getIdentifier());
    }
}
