package Basic.classload;

/**
 * 类加载与多态问题
 */
public class Problem1 {
    public static void main(String[] args) {
        /**
         * 该方法将打印：
         * super static code block
         * sub static code block
         *
         * super code block
         * super constructor
         *
         * sub code block
         * sub constructor
         */
        new Sub();
    }

    static class Super {
        static {
            System.out.println("super static code block");
        }

        {
            System.out.println("super code block");
        }

        public Super() {
            System.out.println("super constructor");
        }
    }

    static class Sub extends Super {
        static {
            System.out.println("sub static code block");
        }

        {
            System.out.println("sub code block");
        }

        public Sub() {
            System.out.println("sub constructor");
        }
    }
}

