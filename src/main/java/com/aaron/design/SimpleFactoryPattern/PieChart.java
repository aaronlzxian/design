package com.aaron.design.SimpleFactoryPattern;

public class PieChart implements Chart {

    public PieChart() {
        System.out.println("Pie init");
    }

    @Override
    public void display() {
        System.out.println("Pie display");
    }
}
