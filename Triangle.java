//Written by Junnior Lucero, lucer045

import java.awt.Color;
public class Triangle{

    double xPosition; //xPosition of bottom left-corner
    double yPosition; //yPosition of bottom right-corner
    double width; //width of triangle
    double height; //height of triangle
    Color colorName; //color of triangle

    public Triangle(double initWidth, double initHeight, double xPos, double yPos){
        width = initWidth;
        height = initHeight;
        xPosition = xPos;
        yPosition = yPos;

    }

    public double calculatePerimeter(){
        return (2*height) + width;
    }
    
    public double calculateArea(){
        return 0.5*height*width;
    }

    public void setColor(Color color){
        colorName = color;
    }
    
    public void setPos(double xPos, double yPos){
        xPosition = xPos;
        yPosition = yPos;
    }

    public void setHeight(double initHeight){
        height = initHeight;
    }

    public void setWidth(double initWidth){
        width = initWidth;
    }

    public Color getColor(){
        return colorName;
    }

    public double getXPos(){ //x position of bottom left corner
        return xPosition;
    }

    public double getYPos(){ //y position of bottom left corner
        return yPosition;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }
}