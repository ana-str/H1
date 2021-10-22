package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe1Test {

    @Test
    void maximalAbgerundeteNote(int [] Grades) {

        Aufgabe1 student1 = new Aufgabe1();
        //int [] Grades = new int [] { 30, 57, 89, 38, 75, 99, 42};
        assertEquals(student1.maximalAbgerundeteNote(Grades), 100);

    }
}