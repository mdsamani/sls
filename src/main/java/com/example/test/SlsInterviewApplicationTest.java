package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.slsinterview.SlsInterviewApplication;

public class SlsInterviewApplicationTest {

    SlsInterviewApplication slsInterviewApplication = new SlsInterviewApplication();

    @Test
    void testSum(){
        int count = slsInterviewApplication.sum(0);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(1);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(3);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(5);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(9);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(11);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(13);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(2);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(18);
        assertEquals(1, count);
        count = slsInterviewApplication.sum(22);
        assertEquals(1, count);
        count = slsInterviewApplication.sum(26);
        assertEquals(0, count);
        count = slsInterviewApplication.sum(4);
        assertEquals(1, count);
        count = slsInterviewApplication.sum(6);
        assertEquals(1, count);
        count = slsInterviewApplication.sum(10);
        assertEquals(1, count);
        count = slsInterviewApplication.sum(12);
        assertEquals(2, count);
        count = slsInterviewApplication.sum(14);
        assertEquals(3, count);
    }

    @Test
    void testMultiply(){
        int count = slsInterviewApplication.multiply(0);
        assertEquals(0, count);
        count = slsInterviewApplication.multiply(1);
        assertEquals(0, count);
        count = slsInterviewApplication.multiply(3);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(5);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(9);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(11);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(13);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(2);
        assertEquals(0, count);
        count = slsInterviewApplication.multiply(25);
        assertEquals(0, count);
        count = slsInterviewApplication.multiply(81);
        assertEquals(0, count);
        count = slsInterviewApplication.multiply(121);
        assertEquals(0, count);
        count = slsInterviewApplication.multiply(143);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(15);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(27);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(33);
        assertEquals(1, count);
        count = slsInterviewApplication.multiply(39);
        assertEquals(1, count);
    }

}