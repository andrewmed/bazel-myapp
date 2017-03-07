package org.andmed.devtools;

import org.andmed.devtools.unix.UnixJni;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class UnixTests {


    @Test
    public void jni() throws Exception {
        UnixJni.loadJni();
        assertEquals(10, UnixJni.dummy());
    }
}
