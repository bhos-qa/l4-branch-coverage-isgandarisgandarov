package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestClassroom {

    Student student;

    @BeforeEach
    void setUp() {student= new Student(); }

    @Test
    @DisplayName("Name should be set")
    void testSetName() {
        assertEquals("Ahmad", student.setName("Ahmad"), "Name set should work for any name");
    }

    @Test
    @DisplayName("Age should be set")
    void testSetAge() {
        assertEquals(25, student.setAge(25), "Age set should work for any age");
    }

    @Test
    @DisplayName("Address should be set")
    void testSetAddress() {
        assertEquals("Azadlig street 14", student.setAddress("Azadlig street 14"), "Address set should work for any address");
    }

    @Test
    @DisplayName("Email should be set")
    void testSetEmail() {
        assertEquals("ahmad@gmail.com", student.setEmail("ahmad@gmail.com"), "Email set should work for any Email");
    }

    @Test
    @DisplayName("Sex should be set")
    void testSetSex() {
        assertEquals(Sex.MALE, student.setSex(Sex.MALE), "Sex should be set for one of the two given sexes");
    }
}