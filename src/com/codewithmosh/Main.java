package com.codewithmosh;

import com.codewithmosh.memento.exercise.Document;
import com.codewithmosh.memento.exercise.History;
import com.codewithmosh.state.BrushTool;
import com.codewithmosh.state.Canvas;
import com.codewithmosh.state.EraserTool;
import com.codewithmosh.state.SelectionTool;


public class Main {
    public static void main(String[] args) {
        var canvas =  new Canvas();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
