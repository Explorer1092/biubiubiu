package example;

public class TestException extends RuntimeException{
    private static final long serialVersionUID = -1484113975578015987L;

    public TestException() {
        super();
    }

    public TestException(String message) {
        super(message);
    }

    public void test() {
        int a = 10;
        if (a > 9) {
            throw new TestException("this is exception");
        }
    }



    public static void main(String[] args) {
        TestException T = new TestException();
        T.test();
    }

}
//
//public  class TestException{
//    public  static void throwException(String message) {
//        throw new RuntimeException(message);
//    }
//
//    public void test() {
//        int a = 10;
//        if (a > 9) {
//            TestException.throwException("this is exception");
//        }
//    }
//
//    public static void main(String[] args) {
//        TestException t = new TestException();
//        t.test();
//    }
//}