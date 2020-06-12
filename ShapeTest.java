package com.elec0021;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeTest{

    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        double x;
        double y;
        double r;
        double h;
        String point_out;
        String circle_out;
        String cylinder_out;
	while(true){
	    System.out.println("Enter 1 for point, enter 2 for circle, enter 3 for cylinder and enter 4 to exit.");
        try {
            int num = user_input.nextInt();
            switch (num){
                case 1:
                    System.out.print("Enter x value:");
                    x = user_input.nextDouble();
                    System.out.print("Enter y value:");
                    y = user_input.nextDouble();
                    Point point = new Point(x,y);
                    point_out = "Name: " + point.getName() + " Coordinate: " + point.toString() + " Area: " + point.getArea() + " Volume: " + point.getVolume();
                    System.out.print(point_out + "\n");
                    break;
                case 2:
                    System.out.print("Enter x value:");
                    x = user_input.nextDouble();
                    System.out.print("Enter y value:");
                    y = user_input.nextDouble();
                    System.out.print("Enter r value:");
                    r = user_input.nextDouble();
                    Circle circle = new Circle(x,y,r);
                    circle_out = "Name: " + circle.getName() + " Coordinate: " + circle.toString() + " Area: " + circle.getArea() + " Volume: " + circle.getVolume();
                    System.out.print(circle_out + "\n");
                    break;
                case 3:
                    System.out.print("Enter x value:");
                    x = user_input.nextDouble();
                    System.out.print("Enter y value:");
                    y = user_input.nextDouble();
                    System.out.print("Enter r value:");
                    r = user_input.nextDouble();
                    System.out.print("Enter h value:");
                    h = user_input.nextDouble();
                    Cylinder cylinder = new Cylinder(x,y,r,h);
                    cylinder_out = "Name: " + cylinder.getName() + " Coordinate: " + cylinder.toString() + " Area: " + cylinder.getArea() + " Volume: " + cylinder.getVolume();
                    System.out.print(cylinder_out + "\n");
                    break;
                case 4:
                    System.exit(0);
                default:
                    throw new InputMismatchException();
            }
        }catch (Exception e){
            System.out.print("Invalid value please try again\n");
            user_input.nextLine();
        }

    }
    }
}
