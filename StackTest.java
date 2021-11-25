package com.company;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack<Integer> values;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        values = new Stack<Integer>();
        values.Push(4);
        values.Push(5);
        values.Push(6);
        values.Push(8);
        values.Push(48);
    }

    @org.junit.jupiter.api.Test
    void push() {
        assertEquals(5,values.size());
    }

    @org.junit.jupiter.api.Test
    void top() {
        assertEquals(48,values.Top());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        values.Pop();
        assertEquals(8, values.Top());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(3, values.size());
    }
}