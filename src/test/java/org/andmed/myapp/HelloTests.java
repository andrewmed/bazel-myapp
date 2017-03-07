package org.andmed.myapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class HelloTests {

    @Test
    public void passingTest() throws Exception {
        assertEquals(true,true);
    }
}