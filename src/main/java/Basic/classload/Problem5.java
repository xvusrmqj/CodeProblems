package Basic.classload;

public class Problem5 {
    private static Problem5 t1 = new Problem5();
    private static int i1;
    private static int i2 = 2;

    public Problem5() {
        i1++;
        i2++;
    }

    public static void main(String[] args) {
        Problem5 t2 = new Problem5();
        System.out.println("t2.i1 = " + t2.i1);
        System.out.println("t2.i2 = " + t2.i2);
    }
}
