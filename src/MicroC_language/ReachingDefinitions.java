package MicroC_language;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by darootSandstorm on 11/28/16.
 */
public class ReachingDefinitions {


    private HashMap<Stack<Integer>,HashSet<RDTuple>> hm;
    private AbstractWorklist wl;
    private ProgramGraph pg;

    public ReachingDefinitions(ProgramGraph pg,AbstractWorklist wl) {
        this.wl = wl;
        this.hm = new HashMap<>();
        this.pg = pg;
        populateWorklist();

    }

    private void populateWorklist() {
        for (Stack<Integer> index : this.pg.getVertexList()) {
            for (Edge<Stack<Integer>> e : this.pg.adjacencyList(index)) {
                this.wl.push(e);
            }
        }
    }

    public HashMap<Stack<Integer>,HashSet<RDTuple>> Analyze() {
        while (this.wl.size() != 0) {
            Edge e = (Edge) this.wl.pop();
            BasicOperation old = e.getLabel();


        }

        return this.hm;
    }

    public HashSet<RDTuple> KillGen(BasicOperation op) {
        HashSet<RDTuple> retval = new HashSet<>();
        switch (op.getType()) {
            case "assignvar":


                break;
        }
    }

    public HashMap<Stack<Integer>, HashSet<RDTuple>> getHm() {
        return hm;
    }

    public void setHm(HashMap<Stack<Integer>, HashSet<RDTuple>> hm) {
        this.hm = hm;
    }

    public AbstractWorklist getWl() {
        return wl;
    }

    public void setWl(AbstractWorklist wl) {
        this.wl = wl;
    }
}
