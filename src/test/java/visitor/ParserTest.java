package visitor;

import visitor.printer.EvaluateVisitor;
import visitor.printer.InFixPrintVisitor;
import visitor.printer.PostFixPrintVisitor;
import visitor.printer.PreFixPrintVisitor;

public class ParserTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Parser parser = new Parser();
        TreeNode rootNode = parser.parse("( 9 % 2 ) + ( 2 - 3 * 4 ) / 5");// spaces are vital!!;
        TreePrinter.print(rootNode);
        System.out.println("infix:");
        InFixPrintVisitor ifpv = new InFixPrintVisitor();
        rootNode.accept(ifpv);
        System.out.println();
        System.out.println("prefix:");
        PreFixPrintVisitor pfpv = new PreFixPrintVisitor();
        rootNode.accept(pfpv);
        System.out.println();
        System.out.println("postfix:");
        PostFixPrintVisitor postfpv = new PostFixPrintVisitor();
        rootNode.accept(postfpv);
        System.out.println();
        System.out.println("evaluate:");
        EvaluateVisitor ev = new EvaluateVisitor();
        rootNode.accept(ev);
        System.out.println("result: " + ev.getValue());
        System.out.println();
    }
}
