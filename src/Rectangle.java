import java.text.DecimalFormat;

/**
 * @file Rectangle.java
 * @date 2/2/2023
 * @author Mr. Smith
 *
 * @description Creates a rectangle with a width and height or a square with a side length.
 * The user can also calculate the perimeter and area of the rectangle and
 * print information about the Rectangle.
 */
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double perimeter;

    //default constructor (make public for CS A)

    /**
     * @description Default constructor that creates a unit triangle
     */
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)

    /**
     * @description Creates a Rectangle object with specified width and height. If the
     * parameters are not greater than 0, they are set to 1.0
     *
     * @param w width of the rectangle
     * @param h height of the rectangle
     */
    public Rectangle(double w, double h){
        width = 1.0;
        height = 1.0;
        if(w > 0){
            width = w;
        }
        if(h > 0){
            height = h;
        }
    }

    public Rectangle(double width){
        this.width = width;
    }

    //accessors

    /**
     *
     * @return the width of the rectangle
     */
    public double getWidth(){
        return width;
    }

    /**
     *
     * @return the height of the rectangle
     */
    public double getHeight(){
        return height;
    }

    /**
     *
     * @return area of rectangle
     */
    public double getArea(){
        return area;
    }

    /**
     *
     * @return perimeter of the rectangle
     */
    public double getPerimeter(){
        return perimeter;
    }

    //mutators

    /**
     * @description Allows the user to change the width of the rectangle.
     *
     * @param newWidth
     */
    public void setWidth(double newWidth){
        width = newWidth;
    }

    /**
     * @description Modifies the height of the rectangle
     * @param newHeight
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    //other methods

    /**
     * @description Calculates area of rectangle.
     */
    public void calculateArea(){
        area = height*width;
    }

    public void calculatePerimeter(){
        perimeter = 2*width + 2*height;
    }







    //toString method
    /**
     *  @description Prints the height and width of rectangle to 2 decimal places
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "The height of the rectangle is " + df.format(height) +
                " and the width is " + df.format(width) + ".";
    }

}