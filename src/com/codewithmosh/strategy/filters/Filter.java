package com.codewithmosh.strategy.filters;

public interface Filter {
    //byte[] apply(byte[] image);
    void apply(String fileName);
}
