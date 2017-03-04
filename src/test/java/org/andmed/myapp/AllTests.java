package org.andmed.myapp;

import org.andmed.myapp.hello.HelloTest;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(HelloTest.class)
public class AllTests {
}
