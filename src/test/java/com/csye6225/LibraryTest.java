package com.csye6225;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {


    @Test
    public void testSomeLibraryMethodSuccess() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Ignore
    @Test
    public void testSomeLibraryMethodFailure() {
        Library classUnderTest = new Library();
        assertFalse("someLibraryMethod should return 'false'", classUnderTest.someLibraryMethod());
    }
}
