package MicroC_language;

import java.util.Stack;

/**
 * Created by root on 11/28/16.
 */
public class ProgramGraph extends Graph<Stack<Integer>> {

    private Stack<Integer> initNode;
    private Stack<Integer> exitNode;


    public ProgramGraph() {
        super(true);
        this.exitNode = new Stack<>();
        this.initNode = new Stack<>();
    }


    public Stack<Integer> getExitNode() {
        return exitNode;
    }

    public void setExitNode(Stack<Integer> exitNode) {
        this.exitNode = exitNode;
    }

    public Stack<Integer> getInitNode() {
        return initNode;
    }

    public void setInitNode(Stack<Integer> initNode) {
        this.initNode = initNode;
    }
}
