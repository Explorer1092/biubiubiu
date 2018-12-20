package example;

/**
 * Created by Shen on 2017/5/1.
 */
public class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        ThreadTest t3 = new ThreadTest();
        t1.setName("this is Thread 1");
        t1.start();
        t2.setName("this is Thread 2");
        t2.start();
        t3.setName("this is Thread 3");
        t3.start();
    }
    /**
     * 以上代码是起了三个线程，每个线程循环三次的输出线程名
     * setName是设置线程名
     * 启动线程要用start()方法，而不是直接调用run方法，请务必注意
     * Thread.currentThread().getName()是获取线程名
     */

}

