// Rectangle class definition
public class Rectangle {

    // instance variables
    private int length;
    private int width;

    int prnLength;
    int penWidth;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    // method that calculates and prints area
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);


    }
    public void printPerimeter() {
        int perimeter = length+length+width+width;
        System.out.println("The perimeter is: "+perimeter);
    }
    public void pen() {
        int penLength = size / 5;
    }


}