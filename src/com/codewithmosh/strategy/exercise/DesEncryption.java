package com.codewithmosh.strategy.exercise;

public class DesEncryption implements Encryption {
    @Override
    public void apply(String message) {
        System.out.println("Encrypting message using DES");
    }
}
