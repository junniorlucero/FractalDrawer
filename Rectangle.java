//Written by Junnior Lucero, lucer045

import java.awt.Color;
public class Rectangle{

    double xPosition; //x position of upper left corner
    double yPosition; //y position of upper left corner
    double width; //width of rectangle
    double height; //height of rectangle
    Color colorName; //color of rectangle

    public Rectangle(double initWidth, double initHeight, double xPos, double yPos){
        width = initWidth;
        height = initHeight;
        xPosition = xPos;
        yPosition = yPos;

    }

    public double calculatePerimeter(){
        return 2*(width + height);
    }

    public double calculateArea(){
        return width*height;
    }

    public void setColor(Color color){
        colorName = color;
    }

    public void setPos(double xPos, double yPos){ //x,y position of upper left corner
    
        xPosition = xPos;
        yPosition = yPos;
    }

    public void setHeight(double initHeight){
        height = initHeight;
    }

    public void setWidth(double initWidth){
        height = initWidth;
    }

    public Color getColor(){
        return colorName;
    }

    public double getXPos(){ //x position of upper left corner
        return xPosition;
    }

    public double getYPos(){ //y position of upper left corner
        return yPosition;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }


}