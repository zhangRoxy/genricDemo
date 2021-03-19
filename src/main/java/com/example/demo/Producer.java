package com.example.demo;

public interface Producer<T> {
    void produce(T t);
    T destroy();
}
