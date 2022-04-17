package com.codewithmosh;

import com.codewithmosh.strategy.*;
import com.codewithmosh.strategy.compressors.JpegCompressor;
import com.codewithmosh.strategy.compressors.PngCompressor;
import com.codewithmosh.strategy.exercise.AesEncryption;
import com.codewithmosh.strategy.exercise.ChatClient;
import com.codewithmosh.strategy.exercise.DesEncryption;
import com.codewithmosh.strategy.filters.BlackAndWhiteFilter;
import com.codewithmosh.strategy.filters.HighContrastFilter;


public class Main {
    public static void main(String[] args) {
        var chatClient = new ChatClient();
        var aesEncryption = new AesEncryption();
        var desEncryption = new DesEncryption();

        chatClient.send(aesEncryption,"hola");
        chatClient.send(desEncryption, "qué tal?");
    }
}
