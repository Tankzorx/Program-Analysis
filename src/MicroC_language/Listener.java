package MicroC_language;
import java.util.Stack;
import MicroC_language.parsing.*;

public class Listener extends MicroCBaseListener{


    // PLEASE FIX MIN DÅRLIGE JAVA
    private Stack<Integer> labels = new Stack<Integer>();
    private Graph<Stack<Integer>> graph = new Graph<Stack<Integer>>(true);


    //slem FIXME: 11/24/16
    //private boolean breakOrContinue = false;

    @Override public void enterProgram(MicroCParser.ProgramContext ctx) {
        labels.push(1);
    }

    @Override public void exitAssignStmt(MicroCParser.AssignStmtContext ctx){
        Stack<Integer> s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        graph.addArc(s1, s2, ctx.getText());
	}

	//FIXME: 11/24/16
    /* vi venter med ifelse den stemmer ikke helt med rigtig grammar
    @Override public void enterIfelseStmt(MicroCParser.IfelseStmtContext ctx) {
        System.out.println(ctx.getChild(2).getText());
    }*/


    @Override public void enterWhileStmt(MicroCParser.WhileStmtContext ctx) {
        int i = 1;
        Stack<Integer>  s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer>  s2 = (Stack<Integer>) labels.clone();
        graph.addArc(s1, s2, "-" + ctx.getChild(2).getText());
        int b  = labels.pop()-1;
        labels.push(b);
        labels.push(i);
        Stack<Integer> s3 = (Stack<Integer>) labels.clone();
        graph.addArc(s1, s3, ctx.getChild(2).getText());

    }

    @Override public void exitWhileStmt(MicroCParser.WhileStmtContext ctx) {
        Stack<Integer> s1 = (Stack<Integer>) labels.clone();
        labels.pop();
        int a = labels.pop()+1;
        labels.push(a);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        //// FIXME: 11/24/16
        //vi kan sætte prev på og så kører den ved enter på ny tiing men det minor detail.
        //private Stack<Integer> prev = new Stack<Integer>();
        //prev.push(new Label(s1, s2, ctx.getText()));
        graph.addArc(s1, s2, "noop");

        //breakOrContinue = false;
    }

    @Override public void enterBreakStmt(MicroCParser.BreakStmtContext ctx){
        Stack<Integer>  s1 = (Stack<Integer>) labels.clone();
        int a = labels.pop()+1;
        int b = labels.pop()+1;
        labels.push(b);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        graph.addArc(s1, s2, ctx.getText());
        labels.pop();
        labels.push(b-1);
        labels.push(a);
    }

    @Override public void enterContinueStmt(MicroCParser.ContinueStmtContext ctx){
        Stack<Integer>  s1 = (Stack<Integer>) labels.clone();
        int a = labels.pop()+1;
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        graph.addArc(s1, s2, ctx.getText());
        labels.push(a);
    }

    @Override public void enterReadStmt(MicroCParser.ReadStmtContext ctx){
        Stack<Integer> s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        graph.addArc(s1, s2, ctx.getText());
    }

    @Override public void enterWriteStmt(MicroCParser.WriteStmtContext ctx){
        Stack<Integer> s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        graph.addArc(s1, s2, ctx.getText());
    }

    @Override public void enterDecl(MicroCParser.DeclContext ctx){
        Stack<Integer>  s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        graph.addArc(s1, s2, ctx.getText());
    }

    @Override public void exitProgram(MicroCParser.ProgramContext ctx) {
        System.out.println(graph);
    }
}