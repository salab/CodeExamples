import java.time.LocalDateTime;
import java.util.List;

public class MoveMethod2 {
    public static LocalDateTime now = LocalDateTime.now();

    public static void printArgsList(List<String> argsList) {
        argsList.forEach((arg) -> {
            System.out.println(arg);
        });
    }

    public static String getNowString() {
        return MoveMethod2.now.toString();
    }
}
