package com.example.t27;

public class Triangle extends Shape {
    private int x;
    private int y;
    
    public TriangleStats(int x, int y) {
        this.x = x;
        this.y = y;
        TriangleArea = (x+y) / 2;
        TrianglePerimeter = x*3;
    }
    
    public int getTriangleArea() {
        return TriangleArea;
    }
    
    public int getTrianglePerimeter() {
        return TrianglePerimeter;
    }
}
