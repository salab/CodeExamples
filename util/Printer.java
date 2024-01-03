package util;

import java.io.PrintStream;
import java.time.LocalDateTime;

/**
 * Printer
 */
public class Printer {
    private final PrintStream printStream;

    public Printer() {
        this(System.out);
    }

    public Printer(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(Object object) {
        LocalDateTime now = LocalDateTime.now();
        printStream.println("--- printing object start at " + now.toString() + " ---");

        printStream.println("class name: " + object.getClass().getName());
        printStream.println("hashCode: " + object.hashCode());
        printStream.println("toString: " + object.toString());

        printStream.println("--- printing object end ---");
    }
}
