package org.example.Lesson4;

public class Triangle {

    private double S;

    public double areaOfATriangle(int a, int b, int c){
        int p = (a+b+c)/2;
        S=Math.sqrt(6*(p-a)*(p-b)*(p-c));
        return S;
    }

}
