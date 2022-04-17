package com.codewithmosh.template.exercise;

public class RoutineTwo extends Routine {
    @Override
    protected void beforeMethod() {

    }

    @Override
    protected void afterMethod() {
        System.out.println("Executing code after removing window...");
    }
}
