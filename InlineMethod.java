import java.util.List;

public class InlineMethod {
    public static void main(String[] args) {
        printArgsList(List.of(args));

        System.out.println(getArgsLength(args));
    }

    private static void printArgsList(List<String> argsList) {
        argsList.forEach((arg) -> {
            System.out.println(arg);
        });
    }

    private static int getArgsLength(String[] args) {
        return args.length;
    }
}
