package com.aaron.design.SimpleFactoryPattern;

public class LineChart implements Chart {

    public LineChart() {
        System.out.println("Line init");
    }

    @Override
    public void display() {
        System.out.println("Line display");
    }
}
