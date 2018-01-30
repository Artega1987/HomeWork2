package com.gmail.artemhaevsky;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(5.2,6.2,7.2);
        Triangle tr2 = new Triangle(7.3,11.3,12.3);
        Triangle tr3 = new Triangle(20.4,22.4,23.4);


        System.out.println(tr1.triangleArea());
        System.out.println(tr2.triangleArea());
        System.out.println(tr3.triangleArea());
    }
}




