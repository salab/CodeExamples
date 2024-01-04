public class ReverseConditional {
    public void method1(boolean flag) {
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void method2(int a) {
        if (a == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void method3(int a) {
        if (0 <= a && a <= 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
