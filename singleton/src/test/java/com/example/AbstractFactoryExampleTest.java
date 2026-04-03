package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;



public class AbstractFactoryExampleTest 
{
    @Test
    void testWinFactoryCreatesWindowsComponents() {
        GUIFactory factory = new WinFactory();
        
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        
        assertNotNull(button);
        assertNotNull(checkbox);
        assertTrue(button instanceof WinButton);
        assertTrue(checkbox instanceof WinCheckbox);
    }

    @Test
    void testMacFactoryCreatesMacComponents() {
        GUIFactory factory = new MacFactory();
        
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        
        assertNotNull(button);
        assertNotNull(checkbox);
        assertTrue(button instanceof MacButton);
        assertTrue(checkbox instanceof MacCheckbox);
    }

    @Test
    void testComponentsCanBePainted() {
        GUIFactory factory = new WinFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        
        assertDoesNotThrow(() -> {
            button.paint();
            checkbox.paint();
        });
    }
}