package Basic.classload;

/**
 * 多态问题
 * 方法有多态
 * 属性没有多态
 */
public class Problem2 {
    public static void main(String[] args) {
        Super a = new Sub();
        a.fun();
        System.out.println(a.i);
    }

    static class Super {
        int i = 1;

        void fun() {
            System.out.println("Super");
        }
    }

    static class Sub extends Super {
        int i = -1;

        void fun() {
            System.out.println("Sub");
        }
    }
}

