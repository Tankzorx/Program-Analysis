package MicroC_language;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import MicroC_language.parsing.*;

import java.util.ArrayList;
import java.util.Stack;

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

		myTree.getRootNode().setValue("ROOT");

		Listener myListener = new Listener(myTree.getRootNode());
		// Walk it and attach our listener


		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(myListener, tree);
		String k = myTree.getRootNode().childNodes.toArray()[0].toString();

		System.out.println(k);
		Stack<ASTNode> myStack = new Stack();
		myStack.push(myTree.getRootNode());

		while (!myStack.empty())
		{
			ASTNode curr = myStack.pop();
			System.out.println(curr);
			for (int i = curr.getChildNodes().toArray().length - 1; i >= 0; i--) {
				ArrayList<ASTNode> cs = curr.getChildNodes();
				ASTNode child = cs.get(i);
				myStack.push(child);
			}
		}
	}
}