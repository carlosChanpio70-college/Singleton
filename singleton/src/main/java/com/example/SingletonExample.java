package com.example;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        s1.showMessage();
        System.out.println(s1 == s2); // true
    }
}