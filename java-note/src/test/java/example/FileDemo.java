package example;

/**
 * Created by Shen on 2017/5/1.
 */
public class FileDemo {
    //    public void file() throws FileNotFoundException{
//        File file = new File("/home/test");
//        FileInputStream fis = new FileInputStream(file);
//        System.out.println("a");
//
//    }
//
//    public void testFile() {
//        try {
//            this.file();
//            System.out.println("b");
//        } catch (FileNotFoundException e) {
//            System.out.println("c");
//        }
//        System.out.println("d");
//    }
    public void runtime() {
        int a = 10;
        if (a > 1) {
            throw new RuntimeException();
            /**
             * Exception的异常却需要我们被动的取捕获，这就达不到方便的目的了，于是，java提供了一个RuntimeException的类
             * 让其在产生异常的同时，不需要我们被动的去处理，这样就很方便了
             */
        }
        System.out.println("a");
    }

    public static void main(String[] args)  {
        FileDemo f = new FileDemo();
        f.runtime();
    }
}
