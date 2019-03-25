package Basic.classload;

/**
 * 类加载与多态问题
 * 无参的构造函数不一定会执行。
 */
public class Problem3 {
    public static void main(String[] args) {
        new Sub();
    }

    static class Super {
        {
            System.out.println("super code block");
        }

        public Super() {
            System.out.println("super constructor");
        }

        public Super(String name) {
            System.out.println("super constructor with argument = " + name);
        }
    }

    static class Sub extends Super {
        {
            System.out.println("sub code block");
        }

        public Sub() {
            super("hello");
            System.out.println("sub constructor");
        }
    }
}

