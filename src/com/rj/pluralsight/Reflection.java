package com.rj.pluralsight;

public class Reflection {

    public String doWorkWithClassVariable() {
        return Reflection.class.getSimpleName();
    }

    public String doWorkWithGetClass() {
        Reflection a = new Reflection();
        return a.getClass().getSimpleName();
    }

    public String doWorkWithClassLoader() {
        Class<?> a = null;
        try {
            a = Class.forName("com.rj.pluralsight.Reflection");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return a.getSimpleName();
    }

}
