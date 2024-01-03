import java.util.List;

public class ExtractMethod {
    public static void main(String[] args) {
        List.of(args).forEach((arg) -> {
            System.out.println(arg);
        });

        System.out.println(args.length);
    }
}
