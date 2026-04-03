package com.example;

interface Button {
    void paint();
}

interface Checkbox {
    void paint();
}

class WinButton implements Button {
    public void paint() { System.out.println("Windows Button"); }
}

class WinCheckbox implements Checkbox {
    public void paint() { System.out.println("Windows Checkbox"); }
}

class MacButton implements Button {
    public void paint() { System.out.println("Mac Button"); }
}

class MacCheckbox implements Checkbox {
    public void paint() { System.out.println("Mac Checkbox"); }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WinFactory implements GUIFactory {
    public Button createButton() { return new WinButton(); }
    public Checkbox createCheckbox() { return new WinCheckbox(); }
}

class MacFactory implements GUIFactory {
    public Button createButton() { return new MacButton(); }
    public Checkbox createCheckbox() { return new MacCheckbox(); }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();
        
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        
        button.paint();
        checkbox.paint();
    }
}