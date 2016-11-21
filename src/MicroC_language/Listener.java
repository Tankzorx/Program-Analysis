package MicroC_language;

import MicroC_language.parsing.*;

import java.util.ArrayList;
import java.util.List;


public class Listener extends MicroCBaseListener{

	ASTNode rootNode;
    ASTNode currParent;

	Listener(ASTNode rootNode) {
		this.rootNode = rootNode;
        this.currParent = rootNode;

	}


	@Override public void enterExpr(MicroCParser.ExprContext ctx) {
		if (ctx.getChildCount() == 3) {
            System.out.println("enterExpr - 3kid");
            // Lav node for PLUS/MINUS/OR
            ASTNode op = new ASTNode(this.currParent);
            op.setValue(ctx.getChild(1).getText());
            this.currParent.pushChild(op);
            this.currParent = op;
        } else {
            System.out.println("enterExpr - non 3kid");
            System.out.println(ctx.getChildCount());
            ASTNode loner = new ASTNode(this.currParent);
            loner.setValue(ctx.getChild(0).getText());
            this.currParent.pushChild(loner);
        }
	}

	@Override public void enterExpr1(MicroCParser.Expr1Context ctx) {
		//System.out.println(ctx.expr1());
	}
//
//	@Override public void enterExpr2(MicroCParser.Expr2Context ctx) {
//		System.out.println(ctx.getText());
//	}
//
	@Override public void enterExpr3(MicroCParser.Expr3Context ctx) {

        System.out.println("ADDING EXPR3:");
        System.out.println("ctx gettext:");
        System.out.println(ctx.getText());
        System.out.println("ctx gettextend");
		ASTNode node = new ASTNode(this.currParent);
        node.setValue(ctx.getText());
        this.currParent.pushChild(node);

	}
}