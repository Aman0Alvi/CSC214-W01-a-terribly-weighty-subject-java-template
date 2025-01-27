package org.example;

public class Converter {
 // Your code goes here
    public String toPounds(int ounces) {
        double pounds = ounces/16.0;
        return String.format("%.4f %s", pounds, (pounds == 1.0) ? "lb" : "lbs");
    }

    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces/16;
        int remainingOunces = ounces % 16;
        return String.format("%d %s %d %s", pounds, (pounds == 1) ? "lb" : "lbs", remainingOunces, (remainingOunces == 1) ? "oz" : "oz");
    }
}
