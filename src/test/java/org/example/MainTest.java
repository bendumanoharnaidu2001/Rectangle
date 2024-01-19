package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testAreaOfRectangle() {
        int result = Main.areaOfRectangle(2, 3);
        assertEquals(6, result);
    }
    @Test
    public void testAreaOfRectangle2() {
        int result = Main.areaOfRectangle(2, 4);
        Assertions.assertEquals(8, result);
    }
    @Test
    public void testAreaOfRectangle3() {
        int result = Main.areaOfRectangle(2, 5);
        assertEquals(10, result);
    }
    @Test
    public void testAreaOfRectangle4() {
        int result = Main.areaOfRectangle(10, 10);
        assertEquals(100, result);
    }
    @Test
    public void testAreaOfRectangle5() {
        int result = Main.areaOfRectangle(0, 20);
        assertEquals(0, result);
    }


    @Test
    public void testPerimeaterOfRectangle() {
        int result = Main.perimeterOfRectangle(2, 3);
        assertEquals(10, result);
    }
    @Test
    public void testPerimeaterOfRectangle2() {
        int result = Main.perimeterOfRectangle(2, 4);
        assertEquals(12, result);
    }
    @Test
    public void testPerimeaterOfRectangle3() {
        int result = Main.perimeterOfRectangle(10, 10);
        assertEquals(40, result);
    }
    @Test
    public void testPerimeaterOfRectangle4() {
        int result = Main.perimeterOfRectangle(0, 20);
        assertEquals(40, result);
    }


    @Test
    public void testareaOfTriangle() {
        int result = Main.areaOfTriangle(2, 3);
        assertEquals(3, result);
    }
    @Test
    public void testareaOfTriangle2() {
        int result = Main.areaOfTriangle(2, 4);
        assertEquals(4, result);
    }
    @Test
    public void testareaOfTriangle3() {
        int result = Main.areaOfTriangle(0, 10);
        assertEquals(0, result);
    }


    @Test
    public void testareaOfCircle() {
        int result = Main.areaOfCircle(2);
        assertEquals(12, result);
    }
    @Test
    public void testareaOfCircle2() {
        int result = Main.areaOfCircle(0);
        assertEquals(0, result);
    }


    @Test
    public void testcircumferenceOfCircle() {
        int result = Main.circumferenceOfCircle(2);
        assertEquals(12, result);
    }
    @Test
    public void testcircumferenceOfCircle2() {
        int result = Main.circumferenceOfCircle(0);
        assertEquals(0, result);
    }


    @Test
    public void testareaofSquare() {
        int value = Main.areaofSquare(0);
        assertEquals(0,value);
    }
    @Test
    public void testareaofSquare2() {
        int result = Main.areaofSquare(2);
        assertEquals(4, result);
    }
}
