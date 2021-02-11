package com.example.t27;

public class Rectangle extends Shape {
    private int x, y, area;

    public Rectangle(int x, int y) {
        this.x = x;
        this. y = y;
        area = x*y;
    }

    public int getArea() {
        return area;
    }
}
