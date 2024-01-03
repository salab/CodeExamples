public class Attribute1 {
    private static final String extractedAttribute = "extracted code";

    private static final String renamedAttribute2 = "renamed attribute";

    public static void main(String[] args) {
        System.err.println(extractedAttribute);

        System.err.println(Attribute2.movedAttribute);

        System.err.println(renamedAttribute2);

        System.err.println("inlined code");
    }
}
