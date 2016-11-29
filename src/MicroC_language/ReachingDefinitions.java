package MicroC_language;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by darootSandstorm on 11/28/16.
 */
public class ReachingDefinitions {


    private HashMap<Stack<Integer>,HashSet<RDTuple>> hm;
    private AbstractWorklist<LabelTuple> wl;
    private ProgramGraph pg;

    public ReachingDefinitions(ProgramGraph pg,AbstractWorklist wl) {
        this.wl = wl;
        this.hm = new HashMap<>();
        this.pg = pg;
        populateWorklist();
        System.out.println(this.wl);

}

    private void populateWorklist() {
        for (Stack<Integer> index : this.pg.getVertexList()) {
            for (Edge<Stack<Integer>> e : this.pg.adjacencyList(index)) {
                this.wl.push(new LabelTuple(index,e.getVertex(),e.getLabel()));
            }
        }
    }

    public HashMap<Stack<Integer>,HashSet<RDTuple>> Analyze() {
        while (this.wl.size() != 0) {

            LabelTuple e = this.wl.pop();
            HashSet<RDTuple> oldKnowledge;
            if (hm.containsKey(e.getFromLabel())) {
                oldKnowledge = hm.get(e.getFromLabel());
            } else {
                oldKnowledge = new HashSet<>();
            }
            //System.out.println("OLDKNOWLEDGE");
            //System.out.println(oldKnowledge);
            HashSet<RDTuple> newKnowledge = KillGen(e, oldKnowledge);
            //System.out.println("NEWKNOWLEDGE");
            //System.out.println(newKnowledge);
//            // FIXME: 11/28/16 Overvej om det er de rigtige neighbours vi pusher
//            // Overvej references..
            if (!oldKnowledge.containsAll(newKnowledge)) {
                System.out.println(newKnowledge);
                newKnowledge.addAll((Collection<? extends RDTuple>) oldKnowledge.clone());
                System.out.println(newKnowledge);
                this.hm.put((Stack<Integer>) e.getToLabel(),newKnowledge);
                for (Edge neighbour : pg.adjacencyList((Stack<Integer>) e.getToLabel())) {
                    //this.hm.put((Stack<Integer>) neighbour.getVertex(),newKnowledge);
                    this.getWl().push(new LabelTuple(e.getToLabel(), (Stack<Integer>) neighbour.getVertex(),neighbour.getLabel()));

                }
            }
        }
        return this.hm;
    }

    public HashSet<RDTuple> KillGen(LabelTuple tuple, HashSet<RDTuple> oldKnowledge) {
        HashSet<RDTuple> retval = new HashSet<>();
        retval = (HashSet<RDTuple>) oldKnowledge.clone();
        HashSet<RDTuple> killSet = new HashSet<>();
        HashSet<RDTuple> genSet = new HashSet<>();


        switch (tuple.getOp().getType()) {
            case "assignvar":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getToLabel()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(tuple.getOp().getIdentifier())) {
                        RDTuple old_copy = new RDTuple(old.getIdentifier(), (Stack<Integer>) old.getLabel().clone());
                        killSet.add(old_copy);
                    }
                }
                break;
            case "decl":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getToLabel()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(tuple.getOp().getIdentifier())) {
                        RDTuple old_copy = new RDTuple(old.getIdentifier(), (Stack<Integer>) old.getLabel().clone());
                        killSet.add(old_copy);
                    }
                }
                break;
            case "read":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getToLabel()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(tuple.getOp().getIdentifier())) {
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
