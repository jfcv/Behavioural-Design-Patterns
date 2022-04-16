package com.codewithmosh.strategy;

import com.codewithmosh.strategy.compressors.Compressor;
import com.codewithmosh.strategy.filters.Filter;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
        System.out.println(fileName + " stored");
    }
}
