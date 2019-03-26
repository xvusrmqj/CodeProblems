package Basic.classload;

public class Problem6 {
    static class SuperClass{
        public SuperClass(){
            System.out.println("SuperClass of constructor");
            m();
        }
        public void m(){
            System.out.println("SuperClass.m()");
        }
    }
    static class SubClassTest extends SuperClass {
        private int i = 10;
        public SubClassTest(){
            System.out.println("SubClass of constructor");
            super.m();
            m();
        }
        public void m(){
            System.out.println("SubClass.m(): i = " + i);
        }
    }
    public static void main(String[] args){
        SuperClass t = new SubClassTest();
    }
}
