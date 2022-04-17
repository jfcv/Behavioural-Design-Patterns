package com.codewithmosh.strategy.exercise;

public class AesEncryption implements Encryption {
    @Override
    public void apply(String message) {
        System.out.println("Encrypting message using AES");
    }
}
