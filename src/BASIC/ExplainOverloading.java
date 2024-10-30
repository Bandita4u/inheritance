package BASIC;

public class ExplainOverloading {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        ExplainOverloading e = new ExplainOverloading();
        System.out.println(e.add(1, 2));
        System.out.println(e.add(6,7,8));
    }

}
