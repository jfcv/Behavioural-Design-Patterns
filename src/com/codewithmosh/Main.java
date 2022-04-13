package com.codewithmosh;

import com.codewithmosh.memento.Editor;
import com.codewithmosh.memento.History;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        System.out.println(editor.getContent());

        editor.setContent("b");
        history.push(editor.createState());
        System.out.println(editor.getContent());

        editor.setContent("c");
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }

}
