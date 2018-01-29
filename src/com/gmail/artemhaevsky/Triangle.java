package com.gmail.artemhaevsky;

public class Triangle {
    int x;
    int y;
    int z;

    public Triangle( int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double triangleArea() {
        double p = (x + y + z) / 2;
        double s = Math.sqrt(p*(p-x)*(p-y)*(p-z));
        return s;

    }
}


