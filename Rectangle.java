//Written by Moyata Ebisso, ebiss001 and Tuujii Burka, burka058
import java.awt.*;
import java.lang.Math.*;
import java.awt.Color.*;
public class Rectangle {
    private double xpos;
    private double ypos;
    private double width;
    private double height;
    private Color col1;
    public Rectangle(double x, double y, double w, double h){
        xpos = x;
        ypos = y;
        height = h;
        width = w;
    }
    public double calculatePerimeter(){
        double pur = (2 * height) + (2 * width);
        return pur;
    }
    public double calculateArea(){
        double area = width * height;
        return area;
    }
    public void setPos(double x, double y){
        xpos = x;
        ypos = y;
    }
    public void setColor(Color c){
        col1 = c;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setWidth(double w){
        width = w;
    }
    public Color getColor(){
        return col1;
    }
    public double getXPos(){
        return xpos;
    }

    public double getYPos(){
        return ypos;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
}

