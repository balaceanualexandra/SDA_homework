package com.sda.balaceanuale.homework.week7.exercise6;


// Change Shape and Animal classes to be abstract. Which methods should/may
//be abstract?
public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(7);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(10, 18);
        System.out.println(rectangle);

        rectangle.printShape();
        circle.printShape();
        System.out.println("rectangle aria: " + rectangle.getAria());
        System.out.println("rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("circle aria: " + circle.getAria());
        System.out.println("circle perimeter: " + circle.getPerimeter());
    }
}
