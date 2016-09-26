package MicroC_language;

import MicroC_language.parsing.*;


public class Kappa extends MicroCBaseListener{


	@Override public void enterExpr(MicroCParser.ExprContext ctx) {
		System.out.println(ctx.getText());
	}
}