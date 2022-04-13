package com.codewithmosh;

import com.codewithmosh.memento.exercise.Document;
import com.codewithmosh.memento.exercise.History;

public class Main {

    public static void main(String[] args) {
        var document = new Document();
        var history = new History();

        document.setContent("agua");
        document.setFontName("Arial");
        document.setFontSize(12);
        history.push(document.createState());
        document.printCurrentDocument();

        document.setContent("tierra");
        document.setFontName("Fontain");
        document.setFontSize(24);
        history.push(document.createState());
        document.printCurrentDocument();

        document.setContent("aire");
        document.setFontName("Fluff");
        document.setFontSize(46);
        document.printCurrentDocument();

        document.restore(history.pop());
        document.printCurrentDocument();

        document.restore(history.pop());
        document.printCurrentDocument();
    }

}
