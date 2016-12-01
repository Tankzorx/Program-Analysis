package MicroC_language;

import java.util.Collection;
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
        System.out.println(this.wl);

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
            System.out.println(wl.toString());
            System.out.println("      ");
            LabelTuple e = this.wl.pop();
            System.out.println(e.getFromLabel());

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

            System.out.println("oldknowledge");
            for (RDTuple old : oldKnowledge) {
                System.out.println(old.getIdentifier().toString() + old.getLabel().toString());
            }
            System.out.println("currentKnowledge");
            for (RDTuple old : currentKnowledge) {
                System.out.println(old.getIdentifier().toString() + old.getLabel().toString());
            }
            if (!(currentKnowledge.containsAll(newKnowledge))) {

                newKnowledge.addAll(currentKnowledge);
                //her skal jegs slå op for gettoLAbelcurrnet og add til newknowledge.
                this.hm.put(((Stack<Integer>) e.getToLabel()).toString(), newKnowledge);
                System.out.println("updating at");
                System.out.println(e.getToLabel().toString());

                for (Edge neighbour : pg.adjacencyList((Stack<Integer>) e.getToLabel())) {
                    System.out.println("adding to wokringlist");
                    System.out.println(neighbour.getVertex().toString());

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
            case "declarr":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getToLabel()));
                for (RDTuple old : oldKnowledge) {
                    if (old.getIdentifier().equals(tuple.getOp().getIdentifier())) {
                        RDTuple old_copy = new RDTuple(old.getIdentifier(), (Stack<Integer>) old.getLabel().clone());
                        killSet.add(old_copy);
                    }
                }
                break;
            case "assignarr":
                genSet.add(new RDTuple(tuple.getOp().getIdentifier(), (Stack<Integer>) tuple.getToLabel()));
                break;
            default:
                break;
        }
        System.out.println(tuple.getFromLabel().toString());
        System.out.println("genSet");
        for(RDTuple x : genSet){
            System.out.println(x.getIdentifier() + x.getLabel());
        }
        System.out.println("killset");
        for(RDTuple x : killSet){
            System.out.println(x.getIdentifier() + x.getLabel());
        }

        System.out.println("retval");
        for(RDTuple x : retval){
            System.out.println(x.getIdentifier() + x.getLabel());
        }
        retval.removeAll(killSet);
        System.out.println("retval efter kill");
        for(RDTuple x : retval){
            System.out.println(x.getIdentifier() + x.getLabel());
        }
        retval.addAll(genSet);
        System.out.println("retval efter gen");
        for(RDTuple x : retval){
            System.out.println(x.getIdentifier() + x.getLabel());
        }
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
