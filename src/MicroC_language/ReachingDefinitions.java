package MicroC_language;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by darootSandstorm on 11/28/16.
 */
public class ReachingDefinitions {


    private HashMap<String,HashSet<RDTuple>> hm;
    private AbstractWorklist<LabelTuple> wl;
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
                this.wl.push(new LabelTuple(index,e.getVertex(),e.getLabel()));
            }
        }
    }

    public HashMap<String, HashSet<RDTuple>> Analyze() {
        while (this.wl.size() != 0) {
            LabelTuple e = this.wl.pop();

            HashSet<RDTuple> oldKnowledge;
            if (hm.containsKey(e.getFromLabel().toString())) {
                oldKnowledge = hm.get(e.getFromLabel().toString());
            } else {
                oldKnowledge = new HashSet<>();
            }


            HashSet<RDTuple> currentKnowledge;
            if (hm.containsKey(e.getToLabel().toString())) {
                currentKnowledge = hm.get(e.getToLabel().toString());
            } else {
                currentKnowledge = new HashSet<>();
            }


            HashSet<RDTuple> newKnowledge = KillGen(e, oldKnowledge);
            if (!(currentKnowledge.containsAll(newKnowledge))) {

                newKnowledge.addAll(currentKnowledge);
                //her skal jegs slå op for gettoLAbelcurrnet og add til newknowledge.
                this.hm.put(((Stack<Integer>) e.getToLabel()).toString(), newKnowledge);

                for (Edge neighbour : pg.adjacencyList((Stack<Integer>) e.getToLabel())) {

                    this.getWl().push(new LabelTuple(e.getToLabel(), (Stack<Integer>) neighbour.getVertex(), neighbour.getLabel()));

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
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getFromLabel(), (Stack<Integer>) tuple.getToLabel()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(tuple.getOp().getIdentifier())) {
                        RDTuple old_copy = new RDTuple(old.getIdentifier(), (Stack<Integer>) old.getLabelFrom(),(Stack<Integer>) old.getLabelTo());
                        killSet.add(old_copy);
                    }
                }
                break;
            case "decl":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getFromLabel(), (Stack<Integer>) tuple.getToLabel()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(tuple.getOp().getIdentifier())) {
                        RDTuple old_copy = new RDTuple(old.getIdentifier(), (Stack<Integer>) old.getLabelFrom(),(Stack<Integer>) old.getLabelTo());
                        killSet.add(old_copy);
                    }
                }
                break;
            case "read":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getFromLabel(), (Stack<Integer>) tuple.getToLabel()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(tuple.getOp().getIdentifier())) {
                        killSet.add(old);
                    }
                }
                break;
            case "declarr":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getFromLabel(), (Stack<Integer>) tuple.getToLabel()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(tuple.getOp().getIdentifier())) {
                        RDTuple old_copy = new RDTuple(old.getIdentifier(), (Stack<Integer>) old.getLabelFrom(),(Stack<Integer>) old.getLabelTo());
                        killSet.add(old_copy);
                    }
                }
                break;
            case "assignarr":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getFromLabel(), (Stack<Integer>) tuple.getToLabel()));
                break;
            case "readarr":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getFromLabel(), (Stack<Integer>) tuple.getToLabel()));
                break;
            default:
                break;
        }
        retval.removeAll(killSet);
        retval.addAll(genSet);
        return retval;

    }

    public HashMap<String, HashSet<RDTuple>> getHm() {
        return hm;
    }

    public void setHm(HashMap<String, HashSet<RDTuple>> hm) {
        this.hm = hm;
    }

    public AbstractWorklist getWl() {
        return wl;
    }

    public void setWl(AbstractWorklist wl) {
        this.wl = wl;
    }
}
