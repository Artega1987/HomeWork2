package com.gmail.artemhaevsky;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(5,6,7);
        Triangle tr2 = new Triangle(7,11,12);
        Triangle tr3 = new Triangle(20,22,23);


        System.out.println(tr1.triangleArea());
        System.out.println(tr2.triangleArea());
        System.out.println(tr3.triangleArea());
    }
}




