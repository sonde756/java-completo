package Exercicio_oop1;

import java.awt.geom.Area;

public class Rectangle {
    public double width;
    public double height;


    public double area() {
        return width * height;
    }

    public double perimenter() {
        return 2 * (width + height);
    }

    public double diagonal() {
       return Math.sqrt(width * width + height * height) ;
    }

    @Override
    public String toString() {
        return  "AREA= " + area() +'\n'+
                "PERIMETER= " + perimenter() +'\n'+
                "DIAGONAL= "+ diagonal();
    }
}