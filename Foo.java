public class Foo {
    void foo(boolean flag) {
        bar(flag);
    }
    private void bar(boolean flag) {
        int baz = flag ? 1 : 0;
        System.out.println(baz);
    }
}
