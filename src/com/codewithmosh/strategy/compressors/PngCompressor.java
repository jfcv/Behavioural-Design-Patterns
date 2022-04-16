package com.codewithmosh.strategy.compressors;

public class PngCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }
}
