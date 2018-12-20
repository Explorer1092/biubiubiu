package example;

/**
 * Created by Shen on 2017/5/1.
 */
public class RunnableTest  implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<3;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        RunnableTest t1 = new RunnableTest();
        Thread thread1 = new Thread(t1);
        RunnableTest t2 = new RunnableTest();
        Thread thread2 = new Thread(t2);
        RunnableTest t3 = new RunnableTest();
        Thread thread3 = new Thread(t3);
        thread1.setName("this is thread 1");
        thread1.start();
        thread2.setName("this is thread 2");
        thread2.start();
        thread3.setName("this is thread 3");
        thread3.start();
    }
    /**
     * 说明：使用Runnable接口，稍微麻烦一点，在启动线程时，需要把线程类给加到Thread类对象里面去，然后用Thread类对象去调用start方法来启动线程
     * 也就是说不管是继承Thread类还是完成Runnable接口，最终都是通过Thread类对象调用start方法来启动线程
     */
}
