package threadPool;

import java.util.concurrent.*;

public class FutureTaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(new task());
        executorService.submit(futureTask);
//        System.out.println(futureTask.get().intValue());;
        while(futureTask.isDone()){
            System.out.println(futureTask.get().intValue());;
        }

    }
}
class task implements Callable{


    @Override
    public Object call() throws Exception {
        Thread.sleep(5000);
        return "1000";
    }
}
