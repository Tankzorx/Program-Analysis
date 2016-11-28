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
            HashSet<RDTuple> oldKnowledge;
            if (hm.containsKey(e.getVertex())) {
                oldKnowledge = hm.get(e.getVertex());
            } else {
                oldKnowledge = new HashSet<>();
            }
            HashSet<RDTuple> newKnowledge = KillGen(e, oldKnowledge);
            // FIXME: 11/28/16 Overvej om det er de rigtige neighbours vi pusher
            // Overvej references..
            if (!oldKnowledge.containsAll(newKnowledge)) {
                newKnowledge.addAll(oldKnowledge);
                this.hm.put((Stack<Integer>) e.getVertex(),newKnowledge);
                for (Edge neighbour : pg.adjacencyList((Stack<Integer>) e.getVertex())) {
                    //this.hm.put((Stack<Integer>) neighbour.getVertex(),newKnowledge);
                    this.getWl().push(neighbour);

                }
            }
        }
        return this.hm;
    }

    public HashSet<RDTuple> KillGen(Edge e,HashSet<RDTuple> oldKnowledge) {
        BasicOperation op = e.getLabel();
        HashSet<RDTuple> retval = new HashSet<>();
        retval.addAll(oldKnowledge);
        HashSet<RDTuple> killSet = new HashSet<>();
        HashSet<RDTuple> genSet = new HashSet<>();


        switch (e.getLabel().getType()) {
            case "assignvar":
                genSet.add(new RDTuple(op.getIdentifier(), (Stack<Integer>) e.getVertex()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(op.getIdentifier())) {
                        killSet.add(old);
                    }
                }
                break;
            case "decl":
                genSet.add(new RDTuple(op.getIdentifier(), (Stack<Integer>) e.getVertex()));
                System.out.println(oldKnowledge);
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(op.getIdentifier())) {
                        killSet.add(old);
                    }
                }
                break;
            case "read":
                genSet.add(new RDTuple(op.getIdentifier(), (Stack<Integer>) e.getVertex()));
                System.out.println(oldKnowledge);
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(op.getIdentifier())) {
                        killSet.add(old);
                    }
                }
                break;

            default:
                break;
        }
        retval.removeAll(killSet);
        retval.addAll(genSet);
        return retval;
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
