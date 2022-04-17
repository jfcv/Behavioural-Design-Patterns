package com.codewithmosh.strategy.exercise;

public class ChatClient {
    public void send(Encryption encryption, String message) {
        encryption.apply(message);
        System.out.println("Sending the encrypted message...");
    }
}
