import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AiMain{
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        // 创建线程池对象,创建5个线程的线程池
        ExecutorService service = Executors.newFixedThreadPool(5);
        // 创建Runnable线程任务对象
        TaskRunnable task = new TaskRunnable();
        // 从线程池中获取线程对象
        service.submit(task);
        System.out.println("----------------------------");
        // 在获取一个线程对象
        service.submit(task);
        // 关闭线程池
        service.shutdown();




        // Scanner sc = new Scanner(System.in);
        // String str;
        // while(true){
        //     str = sc.next();
        //     str = str.replace("吗", "");
        //     str = str.replace("?","!");
        //     str = str.replace("?","!");
        //     System.out.println(str);
        }
    }



class TaskRunnable implements Runnable{
    @Override
    public void run(){
        for( int i=0;i<100;i++){
            System.out.print("自定义线程任务在执行"+i +'\n');
        }
    }
}