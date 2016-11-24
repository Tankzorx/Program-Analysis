package MicroC_language;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import MicroC_language.parsing.*;
import java.util.ArrayList;


public class MicroC {

	public static void main(String args[]) throws Exception {
		if (args.length == 0) {
			System.out.println("Error: No program specified.");
			return;
		}

        MicroCLexer lex = new MicroCLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        MicroCParser parser = new MicroCParser(tokens);
	    ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
		Listener listener = new Listener();
		walker.walk(listener, tree);

        Graph<String> graph = new Graph<String>(true);

        System.out.println(graph.toString());

	}
}