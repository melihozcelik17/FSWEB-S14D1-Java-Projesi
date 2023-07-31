package com.workintech.inheritance.mathModel;


public class Cuboid  extends Rectangle {
   private double height;
    public Cuboid (double width , double lenght , double height) {
        super(width , lenght);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }


    public double getVolume(){
        return height * getArea();
    }
}
