package ReflectionAPI;

public class Test {
    private int i;
    public String s;

    public Test() {
    }

    public Test(int i, String s) {
        this.i = i;
        this.s = s;
    }


    private String reflectionTest(String word) {
        return word;
    }

}
