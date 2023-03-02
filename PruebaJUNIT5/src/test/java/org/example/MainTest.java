package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;

    @BeforeEach
    void setUp() {

        main = new Main();

    }

    @AfterEach
    void tearDown() {
        main = null;

    }

    @Test
    void add() {
        int result = main.add(1,2);
        Assertions.assertEquals(3,result,0,"La suma deberia ser 3");


    }

    @Test
    void concatenate() {

        String result = main.concatenate("Hola","Mundo");
        Assertions.assertEquals("Hola Mundo",result);
    }

    @Test
    void getArray() {

       int [] expectArray = new int[]{1,2,3};
        int[] resultArray = main.getArray();
        Assertions.assertArrayEquals(expectArray,resultArray,"El arreglo debe contener los numero 1,2,3");
    }

    @Test
    void getIterable() {
        Iterable<String> expectedIterable = main.getIterable();
        Iterable<String> resultIterable = main.getIterable();
        Assertions.assertIterableEquals(expectedIterable, resultIterable, "La lista de cadenas debería contener los mismos elementos");

    }

    @Test
    void getLines() {
        java.util.List<String> expectedLines = main.getLines();
        java.util.List<String> resultLines = main.getLines();
        Assertions.assertLinesMatch(expectedLines, resultLines, "Las líneas deberían ser iguales");
    }

    @Test
    void getObject() {

        Object resultObject = main.getObject();
        Assertions.assertNotNull(resultObject, "El objeto no debería ser nulo");

    }

    @Test
    void getNull() {
        String resultNull = main.getNull();
        Assertions.assertNull(resultNull, "La cadena debería ser nula");

    }

    @Test
    public void testSame() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Assertions.assertSame(obj1, obj2, "Los objetos deberían ser el mismo");
    }

    @Test
    public void testNotSame() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Assertions.assertNotSame(obj1, obj2, "Los objetos deberían ser diferentes");
    }

    @Test
    public void testTimeout() {
        Assertions.assertTimeout(java.time.Duration.ofSeconds(1), () -> {
            Thread.sleep(500);
        }, "La tarea debería completarse en menos de 1 segundo");
    }

    @Test
    public void testTimeoutPreemptively() {
        Assertions.assertTimeoutPreemptively(java.time.Duration.ofSeconds(1), () -> {
            Thread.sleep(500);
        }, "La tarea debería completarse en menos de 1 segundo");
    }
}