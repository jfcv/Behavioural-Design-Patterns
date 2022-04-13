package com.codewithmosh;

public class User {
    /**
     * attributes
     */
    private String name;

    /**
     * constructor
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Methods
     */
    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}
