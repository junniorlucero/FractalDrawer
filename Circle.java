//Written by Junnior Lucero, lucer045

import java.awt.Color;
public class Circle{
    double xPosition; //xPosition of center
    double yPosition; //yPosition of center
    double radius; //radius of circle
    Color colorName; //color of circle
    
    public Circle(double rad, double xPos, double yPos){
        radius = rad;
        xPosition = xPos;
        yPosition = yPos;
    }

    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

    public double calculateArea(){
        return (Math.PI*(Math.pow(radius,2)));
    }

    public void setColor(Color color){
        colorName = color;
    }

    public void setPos(double xPos, double yPos){
        xPosition = xPos;
        yPosition = yPos;
    }

    public void setRadius(double rad){
        radius = rad;
    }

    public Color getColor(){
        return colorName;
    }

    public double getXPos(){ //x position of the center
        return xPosition;
    }

    public double getYPos(){ //y position of the center
        return yPosition;
    }

    public double getRadius(){
        return radius;
    }
}   