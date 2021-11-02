package lang;

import lang.ast.*;

public class MsnCounter extends TraversingVisitor {

    static int depth=0;
    static int current=0;

    public static int result(Program root){
        MsnCounter counter = new MsnCounter();
        root.accept(counter, null);
        return counter.depth;
    }

    public Object visit(Block node, Object data){
        current++;
        if(current>depth){
        depth=current;
        }
        return null;
    }
}