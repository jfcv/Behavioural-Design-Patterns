package com.codewithmosh.template.exercise;

public abstract class Routine {
    private Window window;

    public Routine() {
        window = new Window();
    }

    public void close() {
        beforeMethod();

        window.remove();

        afterMethod();
    }

    protected abstract void beforeMethod();
    protected abstract void afterMethod();
}
