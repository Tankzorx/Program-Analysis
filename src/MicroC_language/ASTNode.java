package MicroC_language;


import java.util.ArrayList;

public class ASTNode<T> {

    T value;
    Integer labelIdentifier;
    ASTNode parent;
    ArrayList<ASTNode> childNodes;


    ASTNode(ASTNode parent) {
        this.childNodes = new ArrayList<>();
        this.parent = parent;
    }

    ASTNode() {
        this.childNodes = new ArrayList<>();
        this.parent = null;
    }

    public void pushChild(ASTNode c) {
        this.childNodes.add(c);
        c.setParent(this);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Integer getLabelIdentifier() {
        return labelIdentifier;
    }

    public void setLabelIdentifier(Integer labelIdentifier) {
        this.labelIdentifier = labelIdentifier;
    }

    public ASTNode getParent() {
        return parent;
    }

    public void setParent(ASTNode parent) {
        this.parent = parent;
    }

    public ArrayList<ASTNode> getChildNodes() {
        return childNodes;
    }










}
