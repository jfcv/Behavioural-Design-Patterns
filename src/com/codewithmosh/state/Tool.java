package com.codewithmosh.state;

/**
 * we prefer the ABSTRACT CLASSES instead of INTERFACES
 * when we want to provide some common code to all the child classes
 */
public interface Tool {
    void mouseDown();
    void mouseUp();
}
