package chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/27/12
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
//Tagged Classes Suck - vastly inferior to class hierarchy
public class Figure {
     enum Shape {RECTANGLE, CIRCLE};

     //Tag field - the shape of this figure
     final Shape shape;

    //These fields are only used if shape is RECTANGLE
    double length; double width;

    //THis field is only used if shape is CIRCLE
    double radius;

    //Constructor for circle
    Figure (double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    //Constructor for circle
    Figure (double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area(){
        switch(shape) {
            case RECTANGLE: return length*width;
            case CIRCLE: return Math.PI*(radius*radius);
            default : throw new AssertionError();
        }
    }



}
