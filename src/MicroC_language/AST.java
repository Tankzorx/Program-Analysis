package MicroC_language;

/**
 * Created by root on 10/3/16.
 */
public class AST {

    ASTNode rootNode;

    AST() {
        this.rootNode = new ASTNode();
    }

    public ASTNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(ASTNode rootNode) {
        this.rootNode = rootNode;
    }





}
