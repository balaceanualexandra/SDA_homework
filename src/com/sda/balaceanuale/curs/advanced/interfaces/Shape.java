package com.sda.balaceanuale.curs.advanced.interfaces;

public interface Shape {
    double getArea();
    double getPerimeter();

     double pi = 3.14;
     double euler = 0.5772156649;


     default double whatever(){
         return 4.7;
     }
}
