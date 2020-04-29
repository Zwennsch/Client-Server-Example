package com.svenjava.multiModule;

import java.util.concurrent.CompletableFuture;

public interface Controller {

    CompletableFuture<Integer> onAdd(int num1, int num2);
    
    CompletableFuture<Integer> onSub(int num1, int num2);
}
