package MicroC_language;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import MicroC_language.parsing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;


public class MicroC {

	public static void main(String args[]) throws Exception {
		if (args.length == 0) {
			System.out.println("Error: No program specified.");
			return;
		}

        System.out.println(new HashSet<Integer>().add(2));

        MicroCLexer lex = new MicroCLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        MicroCParser parser = new MicroCParser(tokens);
	    ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        ProgramGraph pg = new ProgramGraph();
		Listener listener = new Listener(pg);
		walker.walk(listener, tree);

		System.out.println(pg);



        ReachingDefinitions myRD = new ReachingDefinitions(pg,new FIFOWorklist<>());
        //System.out.println(myRD.getWl().toString());
        HashMap<Stack<Integer>,HashSet<RDTuple>> result = myRD.Analyze();

        for (Stack<Integer> key : result.keySet()) {
            System.out.println("KEY:" + key.toString());
            for (RDTuple tupl : result.get(key)) {
                System.out.println("(" + tupl.getIdentifier() + "," + tupl.getLabel() + ")");
            }
            System.out.println("KEYEND");
        }




	}
}