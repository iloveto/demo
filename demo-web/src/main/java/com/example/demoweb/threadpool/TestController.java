package com.example.demoweb.threadpool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;

@RestController
public class TestController {

    @RequestMapping("/test")
    public void test() throws ExecutionException, InterruptedException {
        System.out.println("123123");

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future future = executorService.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                Thread.sleep(10000);
                return 1;
            }
        });
        System.out.println(future.get());

    }


}
