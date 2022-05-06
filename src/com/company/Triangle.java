package com.company;

public class Triangle {
   private int a;
    private int b;
    private int c;

    int area(int a, int b){
        c=(a*b)/2;
        System.out.println("Площадь прямоугольного треугольника равен: "+c);
        return c;
    }
}
