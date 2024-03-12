//Written by Junnior Lucero, lucer045

// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;
import java.util.Random;

public class FractalDrawer {
private double totalArea=0; // member variable for tracking the total area
public FractalDrawer() {} // contructor


//TODO:
// drawFractal creates a new Canvas object
// and determines which shapes to draw a fractal by calling appropriate helper
//function
// drawFractal returns the area of the fractal


public double drawFractal(String type) { // drawFractal method is responsible for generating and drawing fractals based on user input.
    Canvas can = new Canvas(1080,1920); //makes a new canvas of size 1920x1080
    Random random = new Random(); //creates a random variable
    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)); //generates a random color based of its RGB value

    can.setBackground(color.lightGray); //sets the color of the canvas to light gray
    
    if(type.equalsIgnoreCase("circle")){ //call drawCircleFractal if type (userinput) is valid
        drawCircleFractal(140, 700, 450, color, can, 7); 
    }
    else if(type.equalsIgnoreCase("triangle")){//call drawTriangleFractal if type (userinput) is valid
        drawTriangleFractal(300, 200, 600, 450, color, can, 7);
    }
    else if(type.equalsIgnoreCase("rectangle")){//call drawRectangleFractal if type (userinput) is valid
        drawRectangleFractal(200, 100, 600, 450, color, can, 7);
    }
    
    return totalArea; 
}

//TODO:
// drawTriangleFractal draws a triangle fractal using recursive techniques
public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas myCanvas, int level){

    Random random = new Random(); //creates a random variable
    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));//generates a random color based of its RGB value
    Triangle newTriangle = new Triangle(width, height, x, y); //create a new triangle object named newTriangle
    newTriangle.setColor(c); //set the color of the newTriangle
    myCanvas.drawShape(newTriangle); //draw a triangle on our canvas

    if(level >= 1){ //recursively call drawTriangleFractal until the level >= 1 to ensure we have 7 layers
        drawTriangleFractal(width*0.5, height*0.5, x+width*0.25, y-height, color, myCanvas, level-1); //create 3 triangles and do level-1 after each execution
        drawTriangleFractal(width*0.5, height*0.5, x-width*0.25, y+height*0.5, color, myCanvas, level-1);
        drawTriangleFractal(width*0.5, height*0.5, x+width*0.75, y+height*0.5, color, myCanvas, level-1);
    }

    totalArea += newTriangle.calculateArea(); //gather the total area 
}

// TODO:
// drawCircleFractal draws a circle fractal using recursive techniques
public void drawCircleFractal(double radius, double x, double y, Color c, Canvas myCanvas, int level){

    Random random = new Random();//creates a random variable
    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));//generates a random color based of its RGB value
    Circle newCircle = new Circle(radius, x, y);//create a new circle object named newCircle
    newCircle.setColor(c); //set the color of the newCircle
    myCanvas.drawShape(newCircle);//draw a circle on our canvas

    if(level >= 1){ //recursively call drawCircleFractal until the level >= 1 to ensure we have 7 layers
        drawCircleFractal(radius*0.5, x-radius*1.5, y, color, myCanvas, level-1);//create 4 circles and do level-1 after each execution
        drawCircleFractal(radius*0.5, x+radius*1.5, y, color, myCanvas, level-1);
        drawCircleFractal(radius*0.5, x, y+radius* 1.5, color, myCanvas, level-1);
        drawCircleFractal(radius*0.5, x, y-radius*1.5, color, myCanvas, level-1);
        
    }

    totalArea += newCircle.calculateArea(); //gather the total area
}


//TODO:
// drawRectangleFractal draws a rectangle fractal using recursive techniques
public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas myCanvas, int level) {

    Random random = new Random();//creates a random variable
    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));//generates a random color based of its RGB value
    Rectangle newRect = new Rectangle(width, height, x, y);//create a new rectangle object named newRect
    newRect.setColor(c); //set the color of the newRect
    myCanvas.drawShape(newRect);//draw a rectangle on our canvas

    if(level >= 1){//recursively call drawRectangleFractal until the level >= 1 to ensure we have 7 layers
       drawRectangleFractal(width*0.5, height*0.5, x-width*0.5, y-height*0.5, color, myCanvas, level-1);//create 4 rectangle and do level-1 after each execution
       drawRectangleFractal(width*0.5, height*0.5, x-width*0.5, y+height, color, myCanvas, level-1);
       drawRectangleFractal(width*0.5, height*0.5, x+width, y-height*0.5, color, myCanvas, level-1);
       drawRectangleFractal(width*0.5, height*0.5, x+width, y+height, color, myCanvas, level-1);

    }
    totalArea += newRect.calculateArea(); //gather the total area

}
//TODO:
// main should ask user for shape input, and then draw the corresponding
//fractal.
// should print area of fractal

public static void main(String[] args){

    System.out.println("Enter your shape: "); //prompt our user to enter a valid shape
    Scanner myScanner = new Scanner(System.in); //create a new scanner object named myScanner
    String input = myScanner.nextLine(); //create a string variable named input to detect the user's input
    FractalDrawer fractalDrawer = new FractalDrawer();  //create a new fractal drawer object
    double result = fractalDrawer.drawFractal(input); //create a double result variable to return the total area of the fractal

    System.out.println("Total area is: " + result); //print total area

    myScanner.close(); //close our scanner object

    }

}


