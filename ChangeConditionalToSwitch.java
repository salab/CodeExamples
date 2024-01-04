public class ChangeConditionalToSwitch {
    public int method1(String id) {
        int value;
        if (id.equals("a")) {
            value = 0; 
        } else if (id.equals("b")) {
            value = 1; 
        } else if (id.equals("c")) {
            value = 2; 
        } else if (id.equals("d")) {
            value = 3; 
        } else {
            value = 4; 
        }
        return value;
    }

    public String method2(int a) {
        if (a == 0) {
            return "a";
        } else if (a == 1) {
            return "b";
        } else if (a == 2) {
            return "c";
        } else if (a == 3) {
            return "d";
        }
        return "e";
    }
}
