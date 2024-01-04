public class ExpandBlock {
    public void method1(int a) {
        if (a == 0) {
            System.out.println("Zero");
        } else if (a == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (a == 0) {
            // nothing to do
        } else if (a == 1) {
            // nothing to do
        } else {
            // nothing to do
        }
    }

    public int method2(int a) {
        int sum = 0;
        int i = 0;
        while (i < a) {
            sum += i++;
        }

        while (i < a) {
            // nothing to do
        }

        return sum;
    }

    public int method3(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }

        for (int i = 0; i < a; i++) {
            // nothing to do
        }

        return sum;
    }

    public int method4(int a) {
        int doubleA = 0;
        {
            doubleA += a;
            doubleA += a;
        }

        {
            // nothing to do
        }

        return doubleA;
    }
}
