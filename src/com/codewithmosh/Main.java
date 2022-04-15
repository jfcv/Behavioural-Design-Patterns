package com.codewithmosh;

import com.codewithmosh.memento.exercise.Document;
import com.codewithmosh.memento.exercise.History;
import com.codewithmosh.state.BrushTool;
import com.codewithmosh.state.Canvas;
import com.codewithmosh.state.EraserTool;
import com.codewithmosh.state.SelectionTool;
import com.codewithmosh.state.exercise.*;


public class Main {
    public static void main(String[] args) {
        var directionService = new DirectionService();

        directionService.setTravelMode(new Driving());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new Bicycling());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new Transit());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new Walking());
        directionService.getEta();
        directionService.getDirection();
    }
}
