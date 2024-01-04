public class IntroduceBlock {
    public void method1(int a) {
        if (a == 0) System.out.println("Zero");
        else if (a == 1) System.out.println("Yes");
        else System.out.println("No");
    }

    public int method2(int a) {
        int sum = 0;
        int i = 0;
        while (i < a) sum += i++;
        return sum;
    }

    public int method3(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) sum += i;
        return sum;
    }

    public int method4(int a) {
        int doubleA = 0;

        doubleA += a;
        doubleA += a;

        return doubleA;
    }
}
