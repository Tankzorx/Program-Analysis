package MicroC_language;
import java.util.Stack;
import MicroC_language.parsing.*;

public class Listener extends MicroCBaseListener{


    private Stack<Integer> labels;
    private ProgramGraph pg;
    private Stack<Integer> lastLabel;


    public Listener(ProgramGraph pg) {
        this.pg = pg;
        this.labels = new Stack<>();
    }

    @Override public void enterProgram(MicroCParser.ProgramContext ctx) {
        labels.push(1);
        Stack<Integer> initNode;
        initNode = (Stack<Integer>) labels.clone();
        pg.setInitNode(initNode);
    }

    @Override public void enterAssignStmt(MicroCParser.AssignStmtContext ctx) {
        Stack<Integer> s1 = (Stack<Integer>) labels.clone();
        int c = labels.pop() + 1;
        labels.push(c);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();

        if (ctx.getChildCount() == 4) {
            pg.addArc(s1, s2, new BasicOperation("assignvar", ctx.getChild(0).getText(), ctx.getChild(2).getText()));
        } else {
            pg.addArc(s1, s2, new BasicOperation("assignarr", ctx.getChild(0).getText(), ctx.getChild(5).getText()));
        }

    }


    @Override public void enterWhileStmt(MicroCParser.WhileStmtContext ctx) {
        int i = 1;
        Stack<Integer>  s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer>  s2 = (Stack<Integer>) labels.clone();
        //pg.addArc(s1, s2, "-" + ctx.getChild(2).getText());
        pg.addArc(s1, s2, new BasicOperation("b","-(" + ctx.getChild(2).getText() + ")"));
        int b  = labels.pop()-1;
        labels.push(b);
        labels.push(i);
        Stack<Integer> s3 = (Stack<Integer>) labels.clone();
        pg.addArc(s1, s3, new BasicOperation("b", "(" + ctx.getChild(2).getText() + ")"));

    }

    @Override public void exitWhileStmt(MicroCParser.WhileStmtContext ctx) {


        Stack<Integer> s1 = (Stack<Integer>) labels.clone();
        Integer prev = labels.pop() - 1;

        // Daddy node
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();

        // Previous node
        Stack<Integer> s3 = (Stack<Integer>) s2.clone();
        // Append ending for node
        s3.push(prev);

        for (Edge e : pg.adjacencyList(s3)) {
            if (e.getVertex().toString().equals(s1.toString())) {
                e.setVertex(s2);
                pg.getVertexList().remove(s1);
            }
        }
        int a = labels.pop() + 1;
        labels.push(a);


    }

    @Override public void enterBreakStmt(MicroCParser.BreakStmtContext ctx){
        Stack<Integer>  s1 = (Stack<Integer>) labels.clone();
        int a = labels.pop()+1;
        int b = labels.pop()+1;
        labels.push(b);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        pg.addArc(s1, s2, new BasicOperation("break"));
        labels.pop();
        labels.push(b-1);
        labels.push(a);
    }

    @Override public void enterContinueStmt(MicroCParser.ContinueStmtContext ctx){
        Stack<Integer>  s1 = (Stack<Integer>) labels.clone();
        int a = labels.pop()+1;
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        pg.addArc(s1, s2, new BasicOperation("continue"));
        labels.push(a);
    }

    @Override public void enterReadStmt(MicroCParser.ReadStmtContext ctx){
        Stack<Integer> s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        if (ctx.getChildCount() == 3) {
            pg.addArc(s1, s2, new BasicOperation("read",ctx.getChild(1).getText(),ctx.getChild(2).getText()));
        } else {
            pg.addArc(s1, s2, new BasicOperation("readarr",ctx.getChild(1).getText(),ctx.getChild(2).getText()));
        }
    }

    @Override public void enterWriteStmt(MicroCParser.WriteStmtContext ctx){
        Stack<Integer> s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        pg.addArc(s1, s2, new BasicOperation("write", ctx.getChild(1).getText()));
    }

    @Override public void enterDecl(MicroCParser.DeclContext ctx){
        Stack<Integer>  s1 = (Stack<Integer>) labels.clone();
        int c  = labels.pop()+1;
        labels.push(c);
        Stack<Integer> s2 = (Stack<Integer>) labels.clone();
        if (ctx.getChildCount() == 3) {
            pg.addArc(s1, s2, new BasicOperation("decl",ctx.getChild(1).getText(),"0"));
        } else {
            pg.addArc(s1, s2, new BasicOperation("declarr",ctx.getChild(1).getText(),"-"));
        }
    }

    @Override public void exitProgram(MicroCParser.ProgramContext ctx) {
        //System.out.println(pg);
        pg.setExitNode(labels);
    }
}