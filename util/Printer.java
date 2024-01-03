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
        printHeader();

        printStream.println("class name:\t" + object.getClass().getName());
        printStream.println("hashCode:\t" + object.hashCode());
        printStream.println("toString:\t" + object.toString());

        printFooter();
    }

    private void printHeader() {
        LocalDateTime now = LocalDateTime.now();
        printStream.println("--- printing object start at " + now.toString() + " ---");
    }
    
    private void printFooter() {
        printStream.println("--- printing object end ---");
    }
}
