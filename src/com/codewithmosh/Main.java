package com.codewithmosh;

import com.codewithmosh.iterator.BrowseHistory;
import com.codewithmosh.iterator.Iterator;
import com.codewithmosh.memento.exercise.Document;
import com.codewithmosh.memento.exercise.History;
import com.codewithmosh.state.BrushTool;
import com.codewithmosh.state.Canvas;
import com.codewithmosh.state.EraserTool;
import com.codewithmosh.state.SelectionTool;
import com.codewithmosh.state.exercise.*;


public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while(iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
