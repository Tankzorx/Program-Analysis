package MicroC_language;

import java.util.Stack;

/**
 * Created by root on 11/28/16.
 */
public class RDTuple {

    private String identifier;
    private Stack<Integer> labelFrom;
    private Stack<Integer> labelTo;

    public RDTuple(String identifier,Stack<Integer> labelFrom, Stack<Integer> labelTo) {
        this.identifier = identifier;
        this.labelFrom = labelFrom;
        this.labelTo = labelTo;
    }

    public Stack<Integer> getLabelFrom() {
        return labelFrom;
    }

    public void setLabelFrom(Stack<Integer> labelFrom) {
        this.labelFrom = labelFrom;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode() + getLabelFrom().hashCode() + getLabelTo().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof RDTuple))
            return false;

        RDTuple other = (RDTuple)obj;

        if (identifier == other.getIdentifier()
                && this.getLabelFrom().toString().equals(other.getLabelFrom().toString())
                && this.getLabelTo().toString().equals(other.getLabelTo().toString())) {
            return true;
        }
        if (identifier == null) return false;

        // equivalence by id
        return identifier.equals(other.getIdentifier())
                && other.getLabelFrom().toString().equals(this.getLabelTo().toString())
                && other.getLabelTo().toString().equals(this.getLabelTo().toString());
    }

    public Stack<Integer> getLabelTo() {
        return labelTo;
    }

    public void setLabelTo(Stack<Integer> labelTo) {
        this.labelTo = labelTo;
    }

    @Override
    public String toString() {
        return "(" + this.getIdentifier() + "," + this.getLabelFrom() + "=>" + this.getLabelTo() + ")";
    }
}
