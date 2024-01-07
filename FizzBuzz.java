public class FizzBuzz {
    public void print(int maxCount) {
        for (int count = 1; count <= maxCount; count++) {
            String s = get(count);
            System.out.println(s);
        }
    }

    private String get(int count) {
        String s = "" + count;
        if (count % 3 == 0) s = "Fizz";
        if (count % 5 == 0) s = "Buzz";
        if (count % 15 == 0) s = "FizzBuzz";
        return s;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print(30);
    }
}
