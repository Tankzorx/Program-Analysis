package MicroC_language;

/**
 * Created by root on 11/28/16.
 */
public class BasicOperation {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    private String identifier;
    private String expr;

    public BasicOperation(String type, String identifier, String expr) {
        this.type = type;
        this.identifier = identifier;
        this.expr = expr;
    }

    public BasicOperation(String type, String expr) {
        this.type = type;
        this.expr = expr;

    }

    public BasicOperation(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return this.type + " VARNAME: " + this.identifier + " EXPR: " + this.expr;
    }
}
