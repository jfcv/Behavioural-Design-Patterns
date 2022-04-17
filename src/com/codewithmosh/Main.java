package com.codewithmosh;

import com.codewithmosh.template.exercise.RoutineTwo;
import com.codewithmosh.template.exercise.RoutineOne;


public class Main {
    public static void main(String[] args) {
        var routineOne = new RoutineOne();
        var routineTwo = new RoutineTwo();

        routineOne.close();
        routineTwo.close();
    }
}
