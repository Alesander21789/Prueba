package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MyClassTest {

    private MyClass myClass;
    private List<String> testList;

    @BeforeEach
    void setUp() {
        myClass = new MyClass();
        testList = new ArrayList<>();
    }

    @Test
    @DisplayName("Test para comprobar el método addToList")
    void testAddToList() {
        myClass.addToList(testList, "elemento1");
        myClass.addToList(testList, "elemento2");
        myClass.addToList(testList, "elemento3");
        Assertions.assertEquals(3, testList.size());
        Assertions.assertEquals("elemento1", testList.get(0));
        Assertions.assertEquals("elemento2", testList.get(1));
        Assertions.assertEquals("elemento3", testList.get(2));
    }

    @Test
    @DisplayName("Test para comprobar que el método addToList lanza excepción con argumento nulo")
    void testAddToListWithNullArgument() {
        Assertions.assertThrows(NullPointerException.class, () -> myClass.addToList(testList, null));
    }

    @Test
    @DisplayName("Test para comprobar que el método addToList lanza excepción con lista nula")
    void testAddToListWithNullList() {
        Assertions.assertThrows(NullPointerException.class, () -> myClass.addToList(null, "elemento1"));
    }

    @Test
    @DisplayName("Test para comprobar que el método divideByZero lanza excepción ArithmeticException")
    void testDivideByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> myClass.divide(5, 0));
    }

    @Test
    @DisplayName("Test para comprobar que el método fail lanza excepción AssertionError")
    void testFail() {
        Assertions.assertThrows(AssertionError.class, () -> myClass.failMethod());
    }

    @Test
    @DisplayName("Test para comprobar el método getString")
    void testGetString() {
        String expected = "Hola, mundo!";
        Assertions.assertEquals(expected, myClass.getString());
    }
}
