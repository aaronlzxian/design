package com.aaron.design.SimpleFactoryPattern;

public class ChartFactory {
    public static Chart instance(String type){
        Chart result = null;
        if (type.equals("pie")){
            result = new PieChart();
        }else if (type.equals("line")){
            result = new LineChart();
        }
        return result;
    }
}
