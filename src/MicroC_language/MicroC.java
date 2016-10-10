package MicroC_language;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import MicroC_language.parsing.*;

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



		AST myTree = new AST();

		Listener myListener = new Listener(myTree.getRootNode());
		// Walk it and attach our listener


		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(myListener, tree);
		String k = ((ASTNode<String>)myTree.getRootNode().childNodes.toArray()[0]).getValue();

		System.out.println(k);

		//analyzePG(pg);

	}
}