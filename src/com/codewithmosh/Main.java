package com.codewithmosh;

import com.codewithmosh.iterator.BrowseHistory;
import com.codewithmosh.iterator.Iterator;
import com.codewithmosh.iterator.exercise.Product;
import com.codewithmosh.iterator.exercise.ProductCollection;
import com.codewithmosh.memento.exercise.Document;
import com.codewithmosh.memento.exercise.History;
import com.codewithmosh.state.BrushTool;
import com.codewithmosh.state.Canvas;
import com.codewithmosh.state.EraserTool;
import com.codewithmosh.state.SelectionTool;
import com.codewithmosh.state.exercise.*;


public class Main {
    public static void main(String[] args) {
        var collection = new ProductCollection();

        collection.add(new Product(1, "azul"));
        collection.add(new Product(2, "morado"));
        collection.add(new Product(3, "amarillo"));

        Iterator iterator = collection.createIterator();
        while(iterator.hasNext()) {
            var product = iterator.current();
            System.out.println(product);
            iterator.next();
        }
    }
}
