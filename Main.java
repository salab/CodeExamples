import util.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printerOut = new Printer();
        printerOut.print("test object");

        Printer printerErr = new Printer(System.err);
        printerErr.print("test object");
    }
}
