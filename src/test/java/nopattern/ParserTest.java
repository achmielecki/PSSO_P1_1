package nopattern;

public class ParserTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        Parser parser = new Parser();
        TreeNode rootNode = parser.parse("( 9 % 2 ) + ( 2 - 3 * 4 ) / 5");// spaces are vital!!;

        TreePrinter.print(rootNode);
        System.out.println("infix:");
        rootNode.inFixPrint();
        System.out.println();
        System.out.println("prefix:");
        rootNode.preFixPrint();
        System.out.println();
        System.out.println("postfix:");
        rootNode.postFixPrint();
        System.out.println();
        System.out.println("evaluate:");
        System.out.println("result: " + rootNode.evaluate());
        System.out.println();
    }

    public static void test2() {
        Parser parser = new Parser();
        TreeNode rootNode = parser.parse("1 + ( 2 - 3 * 4 ) / 5");// spaces are vital!!;
        TreePrinter.print(rootNode);
        System.out.println("infix:");
        rootNode.inFixPrint();
        System.out.println();
        System.out.println("prefix:");
        rootNode.preFixPrint();
        System.out.println();
        System.out.println("postfix:");
        rootNode.postFixPrint();
        System.out.println();
        System.out.println("evaluate:");
        System.out.println("result: " + rootNode.evaluate());
        System.out.println();
    }
}