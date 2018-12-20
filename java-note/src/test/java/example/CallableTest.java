package example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Shen on 2017/5/1.
 */
public class CallableTest<V> implements Callable {

    @Override
    public V call() throws Exception {
        String name = Thread.currentThread().getName();//获取线程名
        for (int i=0;i<3;i++) {
            System.out.println(name);// 循环输出线程名
        }
        return (V) (name + "return result "); //返回值
    }

    public static void main(String[] args) {
        CallableTest<String> tt = new CallableTest<String>(); //Callable接口实现类的实例化
        FutureTask<String> task = new FutureTask<String>(tt);//FutureTask对象实例化，可以理解为起一个线程监控，并将Callable接口实现类对象放入监控
        Thread t = new Thread(task);//线程类实例化，并将线程监控与线程对象结合起来
        t.setName("this is thread 1");
        t.start();
        String returnResult = null;
        try {
            returnResult = task.get(); //获取线程执行完成后的返回值
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(returnResult);
    }
}
