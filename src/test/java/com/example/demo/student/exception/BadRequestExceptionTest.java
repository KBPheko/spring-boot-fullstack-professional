package com.example.demo.student.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class BadRequestExceptionTest {
    /**
     * Method under test: {@link BadRequestException#BadRequestException(String)}
     */
    @Test
    void testConstructor() {
        BadRequestException actualBadRequestException = new BadRequestException("Msg");
        assertNull(actualBadRequestException.getCause());
        assertEquals(0, actualBadRequestException.getSuppressed().length);
        assertEquals("Msg", actualBadRequestException.getMessage());
        assertEquals("Msg", actualBadRequestException.getLocalizedMessage());
    }
}

