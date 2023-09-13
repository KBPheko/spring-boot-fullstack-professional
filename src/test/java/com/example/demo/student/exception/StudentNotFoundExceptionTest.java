package com.example.demo.student.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class StudentNotFoundExceptionTest {
    /**
     * Method under test: {@link StudentNotFoundException#StudentNotFoundException(String)}
     */
    @Test
    void testConstructor() {
        StudentNotFoundException actualStudentNotFoundException = new StudentNotFoundException("Msg");
        assertNull(actualStudentNotFoundException.getCause());
        assertEquals(0, actualStudentNotFoundException.getSuppressed().length);
        assertEquals("Msg", actualStudentNotFoundException.getMessage());
        assertEquals("Msg", actualStudentNotFoundException.getLocalizedMessage());
    }
}

