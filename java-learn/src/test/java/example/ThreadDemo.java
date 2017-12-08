package example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Shen on 2017/5/1.
 */
public class ThreadDemo<V> implements Callable<V> {

    @Override
    public V call() throws Exception {
        String name = Thread.currentThread().getName();//获取线程名
        System.out.println(name);//输出线程名
        return (V) String.format("%sReturn result", name); //返回值
    }


    public static class ThreadPooltest {
        private int threadCount = 10; //定义一共有多少个线程
        private int threadpoolCount = 3;//定义线程池的大小

        public void threadPoolControl() {
            ExecutorService service = Executors.newFixedThreadPool(threadpoolCount); //产生线程池对象
            List<ThreadDemo<Object>> c = new ArrayList<>();//用来存放需要运行的所有的线程对象
            for (int i = 0; i < threadCount; i++) {
                c.add(new ThreadDemo<>());//将线程对象实例化并存放于List中
            }
            try {
                List<Future<Object>> futures = service.invokeAll(c); //执行所有的线程，并返回所有的线程监控对象Future
                service.shutdown();//当所有线程处理完后，会关闭线程池，是非阻塞的方法
                for (Future<Object> future : futures) {
                    System.out.println("循环输出线程池：" + future.get());// 循环输出线程返回值
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

        }

        public static void main(String[] args) {
            ThreadPooltest tp = new ThreadPooltest();
            tp.threadPoolControl();
        }


    }
}