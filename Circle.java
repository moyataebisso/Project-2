//Written by Moyata Ebisso, ebiss001 and Tuujii Burka, burka058
import java.lang.Math.*;
import java.awt.Color.*;
import java.awt.*;
public class Circle {
    private double xpoint;
    private double ypoint;
    private double radius;
    private Color col;
    public Circle(double x, double y, double r){
        xpoint = x;
        ypoint = y;
        radius = r;
    }

    public double calculatePerimeter(){
        double circ = 2 * Math.PI * radius;
        return circ;
    }

    public double calculateArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    public void setColor(Color c){
        col = c;
    }

    public void setPos(double x1, double y2){
        xpoint = x1;
        ypoint = y2;

    }

    public void setRadius(double r1){
        radius = r1;
    }

    public Color getColor() {
        return col;
    }
    public double getXPos(){
        return xpoint;
    }

    public double getYPos(){
        return ypoint;
    }
    public double getRadius(){
        return radius;
    }

}

