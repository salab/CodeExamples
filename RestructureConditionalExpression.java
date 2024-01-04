public class RestructureConditionalExpression {
    public void method1(int a) {
        if (a != 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void method2(int a) {
        if (-5 > a || a > 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
