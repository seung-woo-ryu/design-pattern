package org.example.command;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadInvoker {

    private Command[] commandQueue;
    private Random random = new Random();

    public void setCommands(Command[] commands) {
        this.commandQueue = commands;
    }

    public void executeCommand() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 5개의 작업을 생성하여 쓰레드 풀에 제출
        for (int i = 1; i <= 5; i++) {
            executor.submit(()->{
                int index = random.nextInt(2);
                commandQueue[index].execute();
            });
        }

        // 더 이상 새로운 작업을 받지 않지만 기존의 작업들은 모두 완료
        executor.shutdown();

        // 모든 작업이 완료될 때까지 기다림
        try {
            if (!executor.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("All tasks are finished.");

    }
}
