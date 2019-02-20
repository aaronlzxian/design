package com.aaron.design.SimpleFactoryPattern;

public class Main {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.instance("pie");
        chart.display();
    }
}
