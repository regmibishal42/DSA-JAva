package bishal;




public class Main {
    public static void main(String args[]) {
    String str ="(1+2+3)";
        String str2 ="(1+2)+3)";
        String str3 ="((1+2)+3)";
        BalancedExpressionStack exp = new BalancedExpressionStack();
        System.out.println(exp.checkExpression(str));
        System.out.println(exp.checkExpression(str2));
        System.out.println(exp.checkExpression(str3));

    }
}
