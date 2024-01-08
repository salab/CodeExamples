public class ChangeConditionalToSwitch {
    public int method1(String id) {
        int value;
        switch (id) {
            case "a":
                value = 0;
                break;        
            case "b":
                value = 1;
                break;        
            case "c":
                value = 2;
                break;        
            case "d":
                value = 3;
                break;        
            default:
                value = 4;
                break;
        }
        return value;
    }

    public String method2(int a) {
        switch (a) {
            case 0:
                return "a";
            case 1:
                return "b";
            case 2:
                return "c";
            case 3:
                return "d";
        }
        return "e";
    }
}
