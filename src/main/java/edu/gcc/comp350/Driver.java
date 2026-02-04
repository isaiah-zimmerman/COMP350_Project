package edu.gcc.comp350;

public class Driver {
    public static void main(String[] args) {
        System.out.println("hello jar");
        Calculator c = new Calculator();
        System.out.println(c.add(5, 8));
    }
}
