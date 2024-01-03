import java.util.List;

public class MoveMethod1 {
    public static void main(String[] args) {
        MoveMethod2.printArgsList(List.of(args));

        System.out.println(MoveMethod2.getNowString());
    }
}
