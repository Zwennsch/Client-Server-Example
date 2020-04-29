package com.svenjava.multiModule;

import java.util.concurrent.CompletableFuture;

public class LocalController  implements Controller{
    @Override
    public CompletableFuture<Integer> onAdd(int num1, int num2) {
        var future = new CompletableFuture<Integer>();
        future.complete(num1 + num2);
        return future;
    }

    @Override
    public CompletableFuture<Integer> onSub(int num1, int num2) {
        var future = new CompletableFuture<Integer>();
        future.complete(num1 - num2);
        return future;
    }
}
