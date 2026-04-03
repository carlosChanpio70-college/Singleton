package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void testSingletonReturnsSameInstance() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        assertSame(s1, s2);           // Same object reference
        assertNotNull(s1);
    }

    @Test
    void testShowMessageDoesNotThrowException() {
        Singleton singleton = Singleton.getInstance();
        assertDoesNotThrow(() -> singleton.showMessage());
    }
}