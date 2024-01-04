public class TrimINVERSE {
    public void method1(int a) {
        if (a == 0) {
            // nothing to do
        } else if (a == 1) {
            return;
        } else {
            if (a > 0) System.out.println("positive");
            System.out.println(a);
            System.out.println(a);
            System.out.println(a);
        }
    }

    public void method2(int a) {
        for (int i = 0; i < 10; i++) {
            if (a == i) {
                break;
            } else {
                System.out.println(a);
            }
        }
    }

    public void method3(int a) {
        for (int i = 0; i < 10; i++) {
            if (a == i) {
                continue;
            } else {
                System.out.println(a);
            }
        }
    }

    public void method4(int a) {
        if (a == 1) {
            throw new Error();
        } else {
            System.out.println(a);
        }
    }
}
