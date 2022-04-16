package com.codewithmosh;

import com.codewithmosh.strategy.*;
import com.codewithmosh.strategy.compressors.JpegCompressor;
import com.codewithmosh.strategy.compressors.PngCompressor;
import com.codewithmosh.strategy.filters.BlackAndWhiteFilter;
import com.codewithmosh.strategy.filters.HighContrastFilter;


public class Main {
    public static void main(String[] args) {
        var jpegCompressor = new JpegCompressor();
        var pngCompressor = new PngCompressor();
        var highContrastFilter = new HighContrastFilter();
        var blackAndWhiteFilter = new BlackAndWhiteFilter();
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("a", jpegCompressor, highContrastFilter);
        imageStorage.store("b", pngCompressor, blackAndWhiteFilter);
    }
}
