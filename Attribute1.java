public class Attribute1 {
    private static final String movedAttribute = "moved attribute";
    private static final String renamedAttribute1 = "renamed attribute";
    private static final String inlinedAttribute = "inlined code";

    public static void main(String[] args) {
        System.err.println("extracted code");
        System.err.println(movedAttribute);
        System.err.println(renamedAttribute1);
        System.err.println(inlinedAttribute);
    }
}
