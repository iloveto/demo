package threadPool.futureTask;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.*;

public class Test {
    private static final ExecutorService ex = Executors.newFixedThreadPool(100);
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(executionTask(String.valueOf(i)));
        }
    }

    private static final ConcurrentHashMap<Object, Future<String>> taskCache = new ConcurrentHashMap<>();

    private static String executionTask(final String taskName) {
        while(true) {
            Future<String> future = taskCache.get(taskName);
            if(future == null){
                Callable<String> task = new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return taskName;
                    }
                };
                FutureTask<String> futureTask = new FutureTask<String>(task);
                future = taskCache.putIfAbsent(taskName, futureTask);
                if (future == null) {
                    future = futureTask;
                    futureTask.run();
                }
            }
            try {
                return future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
