import java.util.List;

public class MoveMethod1 {
    public static void main(String[] args) {
        printArgsList(List.of(args));

        System.out.println(getNowString());
    }

    private static void printArgsList(List<String> argsList) {
        argsList.forEach((arg) -> {
            System.out.println(arg);
        });
    }

    private static String getNowString() {
        return MoveMethod2.now.toString();
    }
}
